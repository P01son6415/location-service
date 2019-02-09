package com.zdxk.locationservice.service;

import com.zdxk.locationservice.domain.LocationData;
import org.springframework.stereotype.Service;

public interface LocationDataService {

    /**
     * 新增定位信息
     * @param location
     */
    void addDeviceLocation(LocationData location);
}
