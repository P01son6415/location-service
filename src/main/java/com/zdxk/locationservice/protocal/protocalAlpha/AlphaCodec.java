package com.zdxk.locationservice.protocal.protocalAlpha;

import com.zdxk.locationservice.protocal.BaseCodec;
import com.zdxk.locationservice.protocal.BaseStringMassage;

public class AlphaCodec implements BaseCodec {

    @Override
    public AlphaMessage decode(byte[] rowTcpInbound){

        String strData = new String(rowTcpInbound);
        String[] arrayData = strData.split(",");

        String type = arrayData[1];
        String imei = arrayData[2];
        String[] content = new String[arrayData.length-6];
        System.arraycopy(arrayData,3,content,0,arrayData.length-6);

        return new AlphaMessage(type,imei,content);
    }

    /**
     *
     * @param message Object
     * @return
     */
    @Override
    public byte[] encode(BaseStringMassage message){
        AlphaMessage alphaMessage =(AlphaMessage)message;
        String type = alphaMessage.getType();
        String imei = alphaMessage.getImei();
        String[] content = alphaMessage.getContent();

        StringBuilder stringBuilder = new StringBuilder("$HX,"+type+","+imei);
        for(int i=0;i<content.length;i++){
            stringBuilder.append(",");
            stringBuilder.append(content[i]);
        }
        stringBuilder.append(",#");
        String sum = checksum(stringBuilder.toString());
        stringBuilder.append(",");
        stringBuilder.append(sum.toUpperCase());
        stringBuilder.append(",");
        byte[] telegramTemp = stringBuilder.toString().getBytes();
        byte[] telegram = new byte[telegramTemp.length+2];
        System.arraycopy(telegramTemp,0,telegram,0,telegramTemp.length);
        telegram[telegram.length-2]=0x0d;
        telegram[telegram.length-1]=0x0a;

        return telegram;
    }

    /**
     * 计算校验和
     */
    static String checksum(String input){
        char[] chars = input.toCharArray();
        int sum = chars[0]^chars[1];
        for(int i=2;i<chars.length;i++){
            sum = sum^chars[i];
        }
        return String.format("%02x", sum);
    }
}
