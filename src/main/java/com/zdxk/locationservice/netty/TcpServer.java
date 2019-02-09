package com.zdxk.locationservice.netty;

import com.zdxk.locationservice.service.CurrentChannelService;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.*;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.concurrent.ImmediateEventExecutor;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;

public class TcpServer {
    private final ChannelGroup channelGroup = new DefaultChannelGroup(ImmediateEventExecutor.INSTANCE);
    private final EventLoopGroup bossGroup = new NioEventLoopGroup();//用于服务端接受客户端连接
    private final EventLoopGroup workGroup = new NioEventLoopGroup();//用于SocketChannel网络读写
    private Channel channel;


    public ChannelFuture start(InetSocketAddress address) {
        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(bossGroup, workGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new TcpInitializer())
                .option(ChannelOption.SO_BACKLOG, 128)
                .childOption(ChannelOption.SO_KEEPALIVE, true);

        ChannelFuture future = bootstrap.bind(address).syncUninterruptibly();
        channel = future.channel();
        return future;
    }
    public void destroy() {
        if(channel != null) {
            channel.close();
        }

        channelGroup.close();
        workGroup.shutdownGracefully();
        bossGroup.shutdownGracefully();
    }

    public boolean sendMessage(String imei ,byte[] msg){

        if(CurrentChannelService.getChannel(imei)!=null) {
            SocketChannel outChannel = CurrentChannelService.getChannel(imei);
            ByteBuf msgBuf = Unpooled.buffer();
            msgBuf.writeBytes(msg);
            System.out.println("SendMsg: " + new String(msg));
            outChannel.writeAndFlush(msgBuf);
            return true;
        }else return false;
    }
}

