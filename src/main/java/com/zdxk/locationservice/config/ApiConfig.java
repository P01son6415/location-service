package com.zdxk.locationservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="api")
public class ApiConfig {

    private String baiduAk;

    private String lbs;

    public String getBaiduAk() {
        return baiduAk;
    }

    public void setBaiduAk(String baiduAk) {
        this.baiduAk = baiduAk;
    }

    public String getLbs() {
        return lbs;
    }

    public void setLbs(String lbs) {
        this.lbs = lbs;
    }
}
