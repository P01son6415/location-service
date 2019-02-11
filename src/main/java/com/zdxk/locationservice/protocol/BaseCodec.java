package com.zdxk.locationservice.protocol;

public interface BaseCodec {

    /**
     * 将收到的TCP报文解析到对应的消息类中
     * @param rowTcpInbound 收到的TCP报文
     * @return 消息类
     */
    BaseStringMassage decode(byte[] rowTcpInbound);

    /**
     * 将消息封装成TCP报文
     * @param message
     * @return
     */
    byte[] encode(BaseStringMassage message);



}
