package com.zdxk.locationservice.protocol.protocolNone;

import com.zdxk.locationservice.protocol.BaseStringMassage;

public class NoneMessage extends BaseStringMassage {

    public NoneMessage(String type, String imei, String[] content){
        super(type, imei, content);
    }
}
