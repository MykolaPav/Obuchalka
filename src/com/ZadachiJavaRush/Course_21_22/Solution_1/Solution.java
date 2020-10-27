package com.ZadachiJavaRush.Course_21_22.Solution_1;

public class Solution
{
    public static void main(String[] args)
    {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask)
    {
        byte[] netAddress = new byte[]{
                 (byte)(ip[0] & mask[0])
                ,(byte)(ip[1] & mask[1])
                ,(byte)(ip[2] & mask[2])
                ,(byte)(ip[3] & mask[3])};

        return netAddress;
    }

    public static void print(byte[] bytes)
    {
//        String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(" ", "0");
        for (byte b : bytes) {
            String binStr = Integer.toBinaryString(b & 0xFF);
            System.out.print(("00000000" + binStr + " ").substring(binStr.length()));
        }
    }
}
