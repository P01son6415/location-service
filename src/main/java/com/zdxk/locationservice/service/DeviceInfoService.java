package com.zdxk.locationservice.service;

import com.zdxk.locationservice.domain.DeviceInfo;


public interface DeviceInfoService {

    /**
     * 检查设备是否已经注册
     */
    boolean isExist(String iMEI);

    /**
     * 注册新设备
     */
    void insertDevice(DeviceInfo device);

    /**
     * 更新设备信息
     * @param deviceInfo
     */
    void updateByImeiSelective(DeviceInfo deviceInfo);

}
