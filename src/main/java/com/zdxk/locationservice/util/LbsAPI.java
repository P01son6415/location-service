package com.zdxk.locationservice.util;

import com.alibaba.fastjson.JSONObject;
import com.zdxk.locationservice.config.ApiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class LbsAPI {

    @Autowired
    private ApiConfig apiConfig;

    /**
     * 基站定位接口
     * @param mcc
     * @param mnc
     * @param lac
     * @param cell
     * @return
     */
    public JSONObject getLocJSON(String mcc,String mnc,String lac,String cell){

        String host = apiConfig.getLbs();

        String requestURL = host+"?mcc="+mcc
                +"&mnc="+mnc+"&lac="+lac+"&ci="+cell+"&coord=bd09&output=json";
        JSONObject location = HttpUtil.httpRequestJSON(requestURL,"GET");
        return location;
    }
}
