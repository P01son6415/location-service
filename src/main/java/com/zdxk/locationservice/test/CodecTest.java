package com.zdxk.locationservice.test;


import com.zdxk.locationservice.protocol.protocolAlpha.AlphaCodec;
import com.zdxk.locationservice.protocol.protocolAlpha.AlphaMessage;
import com.zdxk.locationservice.protocol.protocolAlpha.AlphaMessageService;

public class CodecTest {

    public static void main(String[] args) {
        String inbound = "$HX,0005,860721004308250,A,071118,154703,,,0/29633/58971/10/0/29633/53891/10/0/29633/53893/10/0/29633/31953/10/0/29633/8073/10/0/29633/64730/10/0/29633/19582/10,a8574eed0e1c/-82/349672816a48/-60,,#,10,";

        byte[] telegramTemp = inbound.getBytes();
        byte[] telegram = new byte[telegramTemp.length+2];
        System.arraycopy(telegramTemp,0,telegram,0,telegramTemp.length);
        telegram[telegram.length-2]=0x0d;
        telegram[telegram.length-1]=0x0a;

        AlphaCodec codec = new AlphaCodec();
        AlphaMessage message = codec.decode(telegram);
        AlphaMessageService service = new AlphaMessageService();
        service.parseLocation(message);

        codec.encode(message);
        System.out.println(new String(codec.encode(message)));

    }



}
