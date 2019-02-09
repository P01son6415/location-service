package com.zdxk.locationservice.netty;

import com.zdxk.locationservice.util.FormatUtils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;

public class TcpInitializer extends  ChannelInitializer<SocketChannel>{


    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();

        ByteBuf delimiter1 = Unpooled.copiedBuffer(new byte[]{0x0d,0x0a});
        ByteBuf delimiter2 = Unpooled.copiedBuffer(";!".getBytes());
        ByteBuf delimiter3 = Unpooled.copiedBuffer(FormatUtils.hexStringToBytes("FAAF"));

        // 字符串解码和编码
        pipeline.addLast("decoder", new DelimiterBasedFrameDecoder(
                8192,false,delimiter1,delimiter2,delimiter3));

        // 业务逻辑Handler
        pipeline.addLast("handler", new TcpInboundHandler());
    }}
