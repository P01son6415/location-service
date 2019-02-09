package com.zdxk.locationservice.protocal;

import com.zdxk.locationservice.protocal.protocalNone.NoneMessageService;
import com.zdxk.locationservice.protocal.protocalAlpha.AlphaMessageService;
import com.zdxk.locationservice.service.BaseMessageService;

/**
 * 工厂类
 * 根据协议类型生产对应的消息类
 */
public class MessageFactory {


    static public BaseMessageService createMessageService(String hexStrTelegram){
        BaseMessageService messageService = new NoneMessageService();
        int protocal = identifyProtocal(hexStrTelegram);

        switch (protocal){
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
    static public int identifyProtocal(String hexStrTelegram){
        int protocal = 0;
        if (hexStrTelegram.charAt(0)=='F'&&hexStrTelegram.charAt(1)=='A'&&
                hexStrTelegram.charAt(hexStrTelegram.length()-2)=='A'&&
                hexStrTelegram.charAt(hexStrTelegram.length()-1)=='F')
            protocal = 1;
        if(hexStrTelegram.charAt(0)=='2'&&hexStrTelegram.charAt(1)=='4'&&
                hexStrTelegram.charAt(hexStrTelegram.length()-2)=='2'&&
                hexStrTelegram.charAt(hexStrTelegram.length()-1)=='1')
            protocal = 2;
        if(hexStrTelegram.charAt(0)=='2'&&hexStrTelegram.charAt(1)=='4'&&
                hexStrTelegram.charAt(hexStrTelegram.length()-2)=='0'&&
                hexStrTelegram.charAt(hexStrTelegram.length()-1)=='A')
            protocal = 3;
        return protocal;
    }
}
