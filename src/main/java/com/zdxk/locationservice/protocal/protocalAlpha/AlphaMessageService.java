package com.zdxk.locationservice.protocal.protocalAlpha;

import com.alibaba.fastjson.JSONObject;
import com.zdxk.locationservice.domain.DeviceInfo;
import com.zdxk.locationservice.domain.LocationData;
import com.zdxk.locationservice.protocal.BaseStringMassage;
import com.zdxk.locationservice.service.DeviceInfoService;
import com.zdxk.locationservice.service.LocationDataService;
import com.zdxk.locationservice.service.BaseMessageService;
import com.zdxk.locationservice.util.BaiduAPI;
import com.zdxk.locationservice.util.DateUtils;
import com.zdxk.locationservice.util.GPSUtil;
import com.zdxk.locationservice.util.LbsAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AlphaMessageService implements BaseMessageService {

    @Autowired
    private DeviceInfoService deviceInfoService;

    @Autowired
    private LocationDataService locationDataService;


    @Autowired
    private BaiduAPI baiduAPI;

    @Autowired
    private LbsAPI lbsAPI;

    static private AlphaMessageService alphaMessageService;

    @PostConstruct
    public void init(){
        alphaMessageService = this;
    }

    private AlphaCodec codec = new AlphaCodec();

    /**
     * 对收到的报文解码
     * 返回Message类型消息
     * @param ctx
     * @return
     */
    @Override
    public BaseStringMassage telegramToMessage(byte[] ctx){
        AlphaMessage message = codec.decode(ctx);
        return message;
    }

    /**
     * 根据消息类型进行处理
     * 返回应答报文
     * @param message
     */
    @Override
    public byte[] processData(BaseStringMassage message){

        /*  返回给定位设备的报文 */
        byte[] response = new byte[] {0x00} ;

        AlphaMessage alphaMessage = (AlphaMessage)message;

        //获取消息类型
        String type = alphaMessage.getType();
        String[] content = alphaMessage.getContent();

        //根据消息类型进行处理
        switch (type){
            case "0001":
                //设备注册
                register(message);
                response  = codec.encode(new AlphaMessage(alphaMessage.getType(),alphaMessage.getImei(),new String[]{content[0],"OK"}));
                break;
            case "0002":
                //心跳包
                break;
            case "0004":
                //设备对时
                String[] time ={"TIME",DateUtils.dateTimeNow("yyMMddHHmmss")};
                response  = codec.encode(new AlphaMessage("1004",alphaMessage.getImei(),time));
                break;
            case "0005":
                //定位数据
                register(alphaMessage);
                parseLocation(alphaMessage);

        }
        return response;
    }

    /**
     * 解析定位数据
     * 并存入数据库中
     * @param message
     */
    public void parseLocation(AlphaMessage message){

        String[] content = message.getContent();

        /* 写入数据库的位置数据类 */
        LocationData locationData = new LocationData();

        locationData.setDevImei(message.getImei());
        locationData.setProducer("leadcent");
        locationData.setRepTime(DateUtils.getTime());

        /* 设备信息类 */
        DeviceInfo deviceInfo = new DeviceInfo();

        deviceInfo.setDevImei(message.getImei());

        //写入设备状态信息
        String alarm = content[content.length-1];
        if(!alarm.equals("")){
            String[] alarmNum = alarm.split("A");
            for (int i=0;i<alarmNum.length;i++){
                //拆卸报警
                if(alarmNum[i].equals("11")){
                    locationData.setChainState("0");
                    deviceInfo.setStatus("拆卸");
                }
                //低电量报警
                if(alarmNum[i].equals("14")){
                    locationData.setBatValue("5");
                    deviceInfo.setStatus("低电量");
                }
                if(alarmNum[i].equals("7")){
                    deviceInfo.setStatus("拆卸,低电量");
                }
                //关机报警
                if(alarmNum[i].equals("8")){
                    deviceInfo.setStatus("关机");
                }
            }
        }

        //解析设备位置信息
        String locType = content[0];
        String rmc = new String();
        String lbs = new String();

        /* 有效定位数据标识 */
        boolean flag = false;

        switch (locType){
            case "A":
                //混合模式定位
                rmc = content[3];
                lbs = content[5];
                break;
            case "M":
                //基站定位
                lbs = content[5];
                break;
            case "S":
                //卫星定位
                rmc = content[3];
                break;
        }

        if(lbs!=null && lbs.length()!=0){
            //解析基站定位数据
            flag = true;
            String[] lbs_data = lbs.split("/");
            String mnc = lbs_data[0];
            String lac = lbs_data[1];
            String cell = lbs_data[2];
            JSONObject location = alphaMessageService.lbsAPI.getLocJSON("460",mnc,lac,cell);
            locationData.setLac1(lac);
            locationData.setCi1(cell);
            locationData.setMnc1(mnc);
            locationData.setLocName(location.getString("address"));
            locationData.setLat(location.getString("lat"));
            locationData.setLng(location.getString("lon"));
        }else if(rmc != null && rmc.length() != 0){
            //解析GPS定位数据
            flag = true;
            String[] rmc_data = rmc.split("/");

            String latStr = rmc_data[2];
            String latType = rmc_data[3];
            String lonStr = rmc_data[4];
            String lonType = rmc_data[5];

            double lat = GPSUtil.parseLat(latStr, latType);
            double lon = GPSUtil.parseLng(lonStr, lonType);
            double[] bd09 =GPSUtil.gps84_To_bd09(lat, lon);
            locationData.setLat(String.valueOf(bd09[0]));
            locationData.setLng(String.valueOf(bd09[1]));
            locationData.setLocName(alphaMessageService.baiduAPI.getLocName(String.valueOf(bd09[0]),String.valueOf(bd09[1])));
        }

        //检查位置是否有效更新
        if(flag){
            System.out.println("flag");
            System.out.println(locationData);
            alphaMessageService.locationDataService.addDeviceLocation(locationData);

            deviceInfo.setLat(locationData.getLat());
            deviceInfo.setLng(locationData.getLng());
            deviceInfo.setLastLocationTime(DateUtils.getTime());
            deviceInfo.setLocName(locationData.getLocName());
        }

        alphaMessageService.deviceInfoService.updateByImeiSelective(deviceInfo);

    }

    /**
     * 将第一次登录的设备注册到设备表中
     * @param message
     * @return 未注册的设备：true 已注册的设备：false
     */
    public boolean register(Object message){
        AlphaMessage alphaMessage = (AlphaMessage)message;
        if(!alphaMessageService.deviceInfoService.isExist(alphaMessage.getImei())){
            DeviceInfo deviceInfo = new DeviceInfo();
            deviceInfo.setDevImei(alphaMessage.getImei());
            deviceInfo.setProducer("leadcent");
            deviceInfo.setRegisterTime(DateUtils.getTime());
            alphaMessageService.deviceInfoService.insertDevice(deviceInfo);
            return false;
        }
        return true;
    }
}
