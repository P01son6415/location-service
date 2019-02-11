# Alpha通信协议


## 消息结构

| 同步头 | 消息类型 | IMEI | 消息体 | # | 校验和 | 结束符 |
| ------ | ------ | ------ | ------ | ------ |  ------ |  ------ |


结构之间以字符型 ， 分隔

## 同步头

长度：3个字符  
内容：$HX

## 消息类型

长度：4个字符

| 类型码 | 备注 |
| :------: | :------: |
| 0001 | 注册信息 |
| 0002 | 心跳包 |
| 0004 | 设备对时 |
| 0005 | 位置数据 | 

## IMEI

长度：15字符

## 消息体

消息体的长度和内容由消息类型决定

### 注册信息

类型码：0001

| 字段 | 说明 |
| :------: | :------: |
| 随机数 | 4位随机字符 |
| IMSI | SIM卡ID号 |
| PhoneNum | SIM卡电话号 |
| 鉴权码 | 8字符 |

### 位置信息

类型码：0005

| 字段 | 说明 |
| :------: | :------: |
| 定位方式 | 卫星定位或基站定位，由信号强度决定 |
| RMC | GPS原始数据 |
| 基站ID | 基站数据 |
| WIFI 热点 | WIFI定位数据 |
| 报警信息 | 设备电量及状态信息 |

## 校验和

从 $ 到 # 所有字符进行异或得到 1 个字节的十六进制 数，以 2 个 ASCII 字符形式输出

## 结束符

CR, LF  
0x0D,0x0A

## 设备信息

设备使用长连接的方式接收平台主动发送的消息