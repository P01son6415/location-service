package com.zdxk.locationservice;

import com.zdxk.locationservice.netty.TcpServer;
import io.netty.channel.ChannelFuture;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.InetSocketAddress;

@SpringBootApplication
@MapperScan("com.zdxk.locationservice.dao")
public class LocationServiceApplication implements CommandLineRunner {

    int port = 35269;


    @Autowired
    private TcpServer tcpServer;

    @Bean
    public TcpServer tcpServer() {
        return new TcpServer();
    }

    public static void main(String[] args) {




        SpringApplication.run(LocationServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        InetSocketAddress address = new InetSocketAddress( port );
        ChannelFuture future = tcpServer.start(address);

        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                tcpServer.destroy();
            }
        });

        future.channel().closeFuture().syncUninterruptibly();
    }

}

