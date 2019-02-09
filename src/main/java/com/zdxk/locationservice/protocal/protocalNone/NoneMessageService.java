package com.zdxk.locationservice.protocal.protocalNone;

import com.zdxk.locationservice.protocal.BaseStringMassage;
import com.zdxk.locationservice.service.BaseMessageService;

public class NoneMessageService implements BaseMessageService {

    @Override
    public BaseStringMassage telegramToMessage(byte[] ctx){
        String[] content = new String[1];
        content[0] = new String(ctx);
        return new NoneMessage("-","-",content);
    }

    @Override
    public byte[] processData(BaseStringMassage massage){
        return new byte[] {0x00};
    }
}
