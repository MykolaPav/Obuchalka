package com.ZadachiJavaRush.Course_10;

/*
Расставьте правильно операторы приведения типа, чтобы получился ответ: c = 256
int a = (byte)44;
int b = (byte)300;
short c = (byte)(b - a);
 */
public class Solution5 {
    public void javaRush()  {
        int a =  44;
        int b =  300;
        short c = (short) (b - a);
        System.out.println(c);
    }
}
