package com.zdxk.locationservice.service;

import com.zdxk.locationservice.dao.DeviceInfoMapper;
import com.zdxk.locationservice.domain.DeviceInfo;
import com.zdxk.locationservice.domain.DeviceInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("deviceInfoService")
public class DeviceInfoImpl implements DeviceInfoService {

    @Autowired
    DeviceInfoMapper deviceInfoMapper;

    @Override
    public boolean isExist(String iMEI){
        DeviceInfoExample example = new DeviceInfoExample();
        DeviceInfoExample.Criteria criteria = example.createCriteria();
        criteria.andDevImeiEqualTo(iMEI);
        if(deviceInfoMapper.selectByExample(example).size() != 0 ){
            return true;
        }else return false;
    }

    @Override
    public void insertDevice(DeviceInfo device){
        deviceInfoMapper.insertSelective(device);
    }

    @Override
    public void updateByImeiSelective(DeviceInfo deviceInfo){
        String imei = deviceInfo.getDevImei();
        DeviceInfoExample example = new DeviceInfoExample();
        DeviceInfoExample.Criteria criteria = example.createCriteria();
        criteria.andDevImeiEqualTo(imei);
        DeviceInfo device = deviceInfoMapper.selectByExample(example).get(0);
        deviceInfo.setSid(device.getSid());
        deviceInfoMapper.updateByPrimaryKeySelective(deviceInfo);

    }
}
