package com.zdxk.locationservice.service;

import com.zdxk.locationservice.protocal.BaseStringMassage;

public interface BaseMessageService {

    /**
     * 根据消息类型进行处理
     * 返回应答报文
     * @param massage
     */
    byte[] processData(BaseStringMassage massage);


    BaseStringMassage telegramToMessage(byte[] ctx);

}
