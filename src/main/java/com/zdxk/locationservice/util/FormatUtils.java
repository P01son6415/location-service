package com.zdxk.locationservice.util;

public class FormatUtils {

    /*
    计算CheckSum
     */
    public static int checksum(byte[] data, int len) {
        int sum = 0;
        for (int j=0; len > 1; len--) {
            sum += data[j++]&0xff;
            if ((sum & 0x80000000)>0) {
                sum = (sum & 0xffff) + (sum >> 16);//使用1的补码
            }
        }
        if (len == 1) {
            sum += data[data.length-1]&0xff;
        }
        while ((sum >> 16)>0) {
            sum = (sum & 0xffff) + sum >> 16;
        }
        sum=(sum == 0xffff) ? sum& 0xffff : (~sum)&0xffff;
        return sum;
    }

    /*
     * 字符转换为字节
     */
    private static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    /*
     * 16进制字符串转byte数组
     */
    public static byte[] hexStringToBytes(String hex) {

        if ((hex == null) || (hex.equals(""))) {
            return null;
        } else if (hex.length() % 2 != 0) {
            return null;
        } else {
            hex = hex.toUpperCase();
            int len = hex.length() / 2;
            byte[] b = new byte[len];
            char[] hc = hex.toCharArray();
            for (int i = 0; i < len; i++) {
                int p = 2 * i;
                b[i] = (byte) (charToByte(hc[p]) << 4 | charToByte(hc[p + 1]));
            }
            return b;
        }
    }

    /*
     * int转byte[4]
     */
    public static byte[] intToBytes4(int num) {
        byte[] result = new byte[4];
        result[0] = (byte) ((num >>> 24) & 0xff);// 说明一
        result[1] = (byte) ((num >>> 16) & 0xff);
        result[2] = (byte) ((num >>> 8) & 0xff);
        result[3] = (byte) ((num >>> 0) & 0xff);
        return result;
    }

    /*
     * int转byte[2]
     */
    public static byte[] intToBytes2(int num) {
        byte[] result = new byte[2];
        result[0] = (byte) ((num >>> 8) & 0xff);
        result[1] = (byte) ((num >>> 0) & 0xff);
        return result;
    }

    /*
     * byte[4]转int
     */
    public static int bytes4ToInt(byte[] bytes) {
        int result = 0;
        if (bytes.length == 4) {
            int a = (bytes[0] & 0xff) << 24;// 说明二
            int b = (bytes[1] & 0xff) << 16;
            int c = (bytes[2] & 0xff) << 8;
            int d = (bytes[3] & 0xff);
            result = a | b | c | d;
        }
        return result;
    }

    /*
     * byte[2]转int
     */
    public static int bytes2ToInt(byte[] bytes) {
        int result = 0;
        if (bytes.length == 2) {
            int c = (bytes[0] & 0xff) << 8;
            int d = (bytes[1] & 0xff);
            result = c | d;
        }
        return result;
    }

    /*
     * BCD码转为10进制串(阿拉伯数字)
     */
    public static String bcdToStr(byte[] bytes){
        StringBuffer temp=new StringBuffer(bytes.length*2);

        for(int i=0;i<bytes.length;i++){
            temp.append((byte)((bytes[i]& 0xf0)>>>4));
            temp.append((byte)(bytes[i]& 0x0f));
        }
        return temp.toString().substring(0,1).equalsIgnoreCase("0")?temp.toString().substring(1):temp.toString();
    }

    /*
     * 10进制串转为BCD码
     */
    public static byte[] strToBcd(String asc) {
        int len = asc.length();
        int mod = len % 2;

        if (mod != 0) {
            asc = "0" + asc;
            len = asc.length();
        }

        byte abt[] = new byte[len];
        if (len >= 2) {
            len = len / 2;
        }

        byte bbt[] = new byte[len];
        abt = asc.getBytes();
        int j, k;

        for (int p = 0; p < asc.length()/2; p++) {
            if ( (abt[2 * p] >= '0') && (abt[2 * p] <= '9')) {
                j = abt[2 * p] - '0';
            } else if ( (abt[2 * p] >= 'a') && (abt[2 * p] <= 'z')) {
                j = abt[2 * p] - 'a' + 0x0a;
            } else {
                j = abt[2 * p] - 'A' + 0x0a;
            }

            if ( (abt[2 * p + 1] >= '0') && (abt[2 * p + 1] <= '9')) {
                k = abt[2 * p + 1] - '0';
            } else if ( (abt[2 * p + 1] >= 'a') && (abt[2 * p + 1] <= 'z')) {
                k = abt[2 * p + 1] - 'a' + 0x0a;
            }else {
                k = abt[2 * p + 1] - 'A' + 0x0a;
            }

            int a = (j << 4) + k;
            byte b = (byte) a;
            bbt[p] = b;
        }
        return bbt;
    }

}
