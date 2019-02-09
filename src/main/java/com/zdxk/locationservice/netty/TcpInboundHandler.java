package com.zdxk.locationservice.netty;


import com.zdxk.locationservice.protocal.BaseStringMassage;
import com.zdxk.locationservice.protocal.MessageFactory;
import com.zdxk.locationservice.service.BaseMessageService;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.socket.SocketChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.xml.bind.DatatypeConverter;


/*
    接收消息并根据消息所属协议解析并响应
 */
@Component
public class TcpInboundHandler extends ChannelInboundHandlerAdapter{

    private RestTemplate restTemplate = new RestTemplate();

    private static TcpInboundHandler tcpInboundHandler;

    //该注解会在项目启动的时候执行该方法，即spring容器初始化的时候执行，它与构造函数及@Autowired的执行顺序为：
    // 构造函数 >> @Autowired >> @PostConstruct
    @PostConstruct
    public void init(){
        tcpInboundHandler = this;
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        ByteBuf byteBuf = (ByteBuf) msg;
        byte[] inboundByteTelegram = new byte[byteBuf.readableBytes()];
        // msg中存储的是ByteBuf类型的数据，把数据读取到byte[]中
        byteBuf.readBytes(inboundByteTelegram);
        String hexStrTelegram = DatatypeConverter.printHexBinary(inboundByteTelegram);
        BaseMessageService messageService = MessageFactory.createMessageService(hexStrTelegram);

        BaseStringMassage message = messageService.telegramToMessage(inboundByteTelegram);
        System.out.println(message);

        byte[] responseByte = messageService.processData(message);



    }

    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        super.channelRegistered(ctx);

    }


    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        // TODO Auto-generated method stub
        super.channelReadComplete(ctx);
        ctx.flush();
        //ctx.close();

    }

    /**
     * 断开连接后移除Channel
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {

    }

    /*
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
    */



}
