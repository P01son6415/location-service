package com.zdxk.locationservice.util;

import com.alibaba.fastjson.JSONObject;
import com.zdxk.locationservice.config.ApiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaiduAPI {


    //访问应用token
    @Autowired
    private ApiConfig apiConfig;

    /**
     * 逆地理编码
     * @param lat
     * @param lng
     * @return 位置描述信息
     */
    public String getLocName(String lat,String lng){
        String url = "http://api.map.baidu.com/geocoder/v2/?callback=renderReverse&location=" +
                lat + "," + lng + "&output=json&ak=" + apiConfig.getBaiduAk();
        try {
            String locStr = HttpUtil.httpRequest(url, "GET");
            locStr = locStr.substring(29, locStr.length() - 1);
            JSONObject locJSON = JSONObject.parseObject(locStr);
            return locJSON.getJSONObject("result").getString("formatted_address");
        }catch (Exception e){
            return "Fail Getting Locname";
        }

    }

    /**
     * IP定位
     */
    public String getLocByIP(String ip){
        String url = "http://api.map.baidu.com/location/ip?ip="+ip+"&ak="+apiConfig.getBaiduAk();
        JSONObject locJSON = HttpUtil.httpRequestJSON(url,"GET");
        return locJSON.getString("content");
    }

}
