package com.zdxk.locationservice.service;

import io.netty.channel.socket.SocketChannel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 用于保存已激活的Channel
 */
public class CurrentChannelService {

    private static Map<String, SocketChannel> map = new ConcurrentHashMap<>();

    public static void addChannel(String id, SocketChannel channel){
        map.put(id, channel);
    }

    public static Map<String, SocketChannel> getChannels(){
        return map;
    }

    public static SocketChannel getChannel(String id){
        try {
            return map.get(id);
        }catch (Exception e){
            return null;
        }

    }

    public static void removeChannel(String id){
        map.remove(id);
    }

}
