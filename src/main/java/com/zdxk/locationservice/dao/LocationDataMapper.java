package com.zdxk.locationservice.dao;

import com.zdxk.locationservice.domain.LocationData;
import com.zdxk.locationservice.domain.LocationDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocationDataMapper {
    int countByExample(LocationDataExample example);

    int deleteByExample(LocationDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LocationData record);

    int insertSelective(LocationData record);

    List<LocationData> selectByExample(LocationDataExample example);

    LocationData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LocationData record, @Param("example") LocationDataExample example);

    int updateByExample(@Param("record") LocationData record, @Param("example") LocationDataExample example);

    int updateByPrimaryKeySelective(LocationData record);

    int updateByPrimaryKey(LocationData record);
}