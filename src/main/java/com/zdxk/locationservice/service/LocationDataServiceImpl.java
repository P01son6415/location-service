package com.zdxk.locationservice.service;

import com.zdxk.locationservice.dao.LocationDataMapper;
import com.zdxk.locationservice.domain.LocationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("locationDataService")
public class LocationDataServiceImpl implements LocationDataService {

    @Autowired
    LocationDataMapper locationDataMapper;

    @Override
    public void addDeviceLocation(LocationData location){
        locationDataMapper.insertSelective(location);
    }


}
