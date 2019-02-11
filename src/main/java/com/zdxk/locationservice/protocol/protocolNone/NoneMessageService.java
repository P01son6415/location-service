package com.zdxk.locationservice.protocol.protocolNone;

import com.zdxk.locationservice.protocol.BaseStringMassage;
import com.zdxk.locationservice.service.BaseMessageService;
import org.springframework.stereotype.Service;

@Service
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
