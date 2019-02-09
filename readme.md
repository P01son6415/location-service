 location-service
 ====
 定位终端设备数据平台，接收并解析定位数据，可支持多种设备协议。
 
 - 可自定义通信协议
 - 支持基站定位和 GPS 定位
 - 提供 RESTful 接口
 
 移动定位终端  
 -------  
 移动定位终端一般搭载 GPS 和 GPRS 模块，可以采集定位信息并定时发送到指定到数据平台上。
 对于每一台入网设备，都具有唯一的 IMEI （国际移动设备识别码），因此使用 IMEI 来识别设备身份。
 由于 GPRS 网络的特性，终端没有固定的 IP 地址，因此连接只能由终端发起。
 当平台需要主动向终端发送数据时（例如设置命令）需要等待终端建立连接或者使用长连接，
 平台兼容这两种模式。
 
 通信协议  
 -------  
 通信协议定义了数据包的格式，一般由标识位、消息头、消息体、校验和等部分组成。
 消息类型主要包括注册信息、心跳包、定位数据、设备状态等。
 平台提供三种协议示例，可供参考。
 
 
  
 LICENSE
 -------  
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
 
        http://www.apache.org/licenses/LICENSE-2.0
 
     Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.