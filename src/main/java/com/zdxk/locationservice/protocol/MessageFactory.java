package com.zdxk.locationservice.protocol;

import com.zdxk.locationservice.protocol.protocolNone.NoneMessageService;
import com.zdxk.locationservice.protocol.protocolAlpha.AlphaMessageService;
import com.zdxk.locationservice.service.BaseMessageService;

/**
 * 工厂类
 * 根据协议类型生产对应的消息类
 */
public class MessageFactory {


    static public BaseMessageService createMessageService(String hexStrTelegram){
        BaseMessageService messageService = new NoneMessageService();
        int protocol = identifyProtocol(hexStrTelegram);

        switch (protocol){
            case 0:
                break;
            case 3:
                messageService = new AlphaMessageService();
                break;
        }

        return messageService;
    }

    /**
     * 根据报文内容判断所属协议
     * @param hexStrTelegram
     * @return
     */
    static public int identifyProtocol(String hexStrTelegram){
        int protocol = 0;

        //
        //对于头尾标识相同的协议应该抛弃头部
        if (hexStrTelegram.charAt(0)=='F'&&hexStrTelegram.charAt(1)=='A'&&
                hexStrTelegram.charAt(hexStrTelegram.length()-2)=='A'&&
                hexStrTelegram.charAt(hexStrTelegram.length()-1)=='F') {
            protocol = 0;
        }else if(hexStrTelegram.charAt(hexStrTelegram.length()-2)=='A'&&
                hexStrTelegram.charAt(hexStrTelegram.length()-1)=='F')
            protocol = 1;


        if(hexStrTelegram.charAt(0)=='2'&&hexStrTelegram.charAt(1)=='4'&&
                hexStrTelegram.charAt(hexStrTelegram.length()-2)=='2'&&
                hexStrTelegram.charAt(hexStrTelegram.length()-1)=='1')
            protocol = 2;

        //Alpha协议
        if(hexStrTelegram.charAt(0)=='2'&&hexStrTelegram.charAt(1)=='4'&&
                hexStrTelegram.charAt(hexStrTelegram.length()-2)=='0'&&
                hexStrTelegram.charAt(hexStrTelegram.length()-1)=='A')
            protocol = 3;
        return protocol;
    }
}
