package com.ZadachiJavaRush.Course_10;

/*
Добавить одну операцию по преобразованию типа, чтобы на экран вывелось 9
short number = 9;
char zero = '0';
int nine = (zero + number);
 */
public class Solution4 {
    public void javaRush()  {
        short number = 9;
        char zero =  '0';
        short sh = (short) (number = -39);
        int nine = (zero + number);
        System.out.println(nine);
    }
}
