package com.zdxk.locationservice.dao;

import com.zdxk.locationservice.domain.DeviceInfo;
import com.zdxk.locationservice.domain.DeviceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceInfoMapper {
    int countByExample(DeviceInfoExample example);

    int deleteByExample(DeviceInfoExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(DeviceInfo record);

    int insertSelective(DeviceInfo record);

    List<DeviceInfo> selectByExample(DeviceInfoExample example);

    DeviceInfo selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") DeviceInfo record, @Param("example") DeviceInfoExample example);

    int updateByExample(@Param("record") DeviceInfo record, @Param("example") DeviceInfoExample example);

    int updateByPrimaryKeySelective(DeviceInfo record);

    int updateByPrimaryKey(DeviceInfo record);
}