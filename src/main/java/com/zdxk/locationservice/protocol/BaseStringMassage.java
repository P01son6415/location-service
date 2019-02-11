package com.zdxk.locationservice.protocol;

import java.util.Arrays;

public abstract class BaseStringMassage {

    /* 消息类型 */
    private String type;

    /* 设备IMEI号 */
    private String imei;

    /* 消息正文 */
    private String[] content;

    /* 应答报文 */
    private byte[] response = {0x00};


    public BaseStringMassage(String type, String imei, String[] content) {
        this.type = type;
        this.imei = imei;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String[] getContent() {
        return content;
    }

    public void setContent(String[] content) {
        this.content = content;
    }

    public byte[] getResponse() {
        return response;
    }

    public void setResponse(byte[] response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "BaseStringMassage{" +
                "type='" + type + '\'' +
                ", imei='" + imei + '\'' +
                ", content=" + Arrays.toString(content) +
                '}';
    }
}
