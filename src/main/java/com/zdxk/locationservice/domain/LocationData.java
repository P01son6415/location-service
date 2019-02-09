package com.zdxk.locationservice.domain;

public class LocationData {
    private Integer id;

    private String devImei;

    private String lng;

    private String lat;

    private String locName;

    private String chainState;

    private String batValue;

    private String repTime;

    private String spType;

    private String locType;

    private String mcc1;

    private String mnc1;

    private String lac1;

    private String ci1;

    private String mcc2;

    private String mnc2;

    private String lac2;

    private String ci2;

    private String mcc3;

    private String mnc3;

    private String lac3;

    private String ci3;

    private String uploader;

    private String producer;

    private String reserved1;

    private String reserved2;

    private String reserved3;

    private String reserved4;

    private String reserved5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDevImei() {
        return devImei;
    }

    public void setDevImei(String devImei) {
        this.devImei = devImei == null ? null : devImei.trim();
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName == null ? null : locName.trim();
    }

    public String getChainState() {
        return chainState;
    }

    public void setChainState(String chainState) {
        this.chainState = chainState == null ? null : chainState.trim();
    }

    public String getBatValue() {
        return batValue;
    }

    public void setBatValue(String batValue) {
        this.batValue = batValue == null ? null : batValue.trim();
    }

    public String getRepTime() {
        return repTime;
    }

    public void setRepTime(String repTime) {
        this.repTime = repTime == null ? null : repTime.trim();
    }

    public String getSpType() {
        return spType;
    }

    public void setSpType(String spType) {
        this.spType = spType == null ? null : spType.trim();
    }

    public String getLocType() {
        return locType;
    }

    public void setLocType(String locType) {
        this.locType = locType == null ? null : locType.trim();
    }

    public String getMcc1() {
        return mcc1;
    }

    public void setMcc1(String mcc1) {
        this.mcc1 = mcc1 == null ? null : mcc1.trim();
    }

    public String getMnc1() {
        return mnc1;
    }

    public void setMnc1(String mnc1) {
        this.mnc1 = mnc1 == null ? null : mnc1.trim();
    }

    public String getLac1() {
        return lac1;
    }

    public void setLac1(String lac1) {
        this.lac1 = lac1 == null ? null : lac1.trim();
    }

    public String getCi1() {
        return ci1;
    }

    public void setCi1(String ci1) {
        this.ci1 = ci1 == null ? null : ci1.trim();
    }

    public String getMcc2() {
        return mcc2;
    }

    public void setMcc2(String mcc2) {
        this.mcc2 = mcc2 == null ? null : mcc2.trim();
    }

    public String getMnc2() {
        return mnc2;
    }

    public void setMnc2(String mnc2) {
        this.mnc2 = mnc2 == null ? null : mnc2.trim();
    }

    public String getLac2() {
        return lac2;
    }

    public void setLac2(String lac2) {
        this.lac2 = lac2 == null ? null : lac2.trim();
    }

    public String getCi2() {
        return ci2;
    }

    public void setCi2(String ci2) {
        this.ci2 = ci2 == null ? null : ci2.trim();
    }

    public String getMcc3() {
        return mcc3;
    }

    public void setMcc3(String mcc3) {
        this.mcc3 = mcc3 == null ? null : mcc3.trim();
    }

    public String getMnc3() {
        return mnc3;
    }

    public void setMnc3(String mnc3) {
        this.mnc3 = mnc3 == null ? null : mnc3.trim();
    }

    public String getLac3() {
        return lac3;
    }

    public void setLac3(String lac3) {
        this.lac3 = lac3 == null ? null : lac3.trim();
    }

    public String getCi3() {
        return ci3;
    }

    public void setCi3(String ci3) {
        this.ci3 = ci3 == null ? null : ci3.trim();
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader == null ? null : uploader.trim();
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer == null ? null : producer.trim();
    }

    public String getReserved1() {
        return reserved1;
    }

    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1 == null ? null : reserved1.trim();
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2 == null ? null : reserved2.trim();
    }

    public String getReserved3() {
        return reserved3;
    }

    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3 == null ? null : reserved3.trim();
    }

    public String getReserved4() {
        return reserved4;
    }

    public void setReserved4(String reserved4) {
        this.reserved4 = reserved4 == null ? null : reserved4.trim();
    }

    public String getReserved5() {
        return reserved5;
    }

    public void setReserved5(String reserved5) {
        this.reserved5 = reserved5 == null ? null : reserved5.trim();
    }

    @Override
    public String toString() {
        return "LocationData{" +
                "devImei='" + devImei + '\'' +
                ", lng='" + lng + '\'' +
                ", lat='" + lat + '\'' +
                ", locName='" + locName + '\'' +
                ", chainState='" + chainState + '\'' +
                ", batValue='" + batValue + '\'' +
                ", repTime='" + repTime + '\'' +
                ", spType='" + spType + '\'' +
                ", locType='" + locType + '\'' +
                ", mcc1='" + mcc1 + '\'' +
                ", mnc1='" + mnc1 + '\'' +
                ", lac1='" + lac1 + '\'' +
                ", ci1='" + ci1 + '\'' +
                ", uploader='" + uploader + '\'' +
                ", producer='" + producer + '\'' +
                ", reserved1='" + reserved1 + '\'' +
                ", reserved2='" + reserved2 + '\'' +
                ", reserved3='" + reserved3 + '\'' +
                '}';
    }
}