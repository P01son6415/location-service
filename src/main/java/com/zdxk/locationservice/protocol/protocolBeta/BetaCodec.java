package com.zdxk.locationservice.protocol.protocolBeta;

import com.zdxk.locationservice.protocol.BaseCodec;
import com.zdxk.locationservice.protocol.BaseStringMassage;

public class BetaCodec implements BaseCodec {

    @Override
    public BetaMessage decode(byte[] rowTcpInbound){
        String strData = new String(rowTcpInbound);
        String[] arrayData = strData.split(",");

        String type = "0";
        String imei = arrayData[1];
        String[] content = arrayData;
        return new BetaMessage(type,imei,content);
    }

    @Override
    public byte[] encode(BaseStringMassage message){
        return new byte[]{0x00};
    }
}
