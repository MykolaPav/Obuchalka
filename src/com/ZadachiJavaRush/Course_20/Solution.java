package com.ZadachiJavaRush.Course_20;

public class Solution
{
    public static void main(String[] args)
    {
        System.out.print(count(5, 5));
        System.out.print(count(7, 5));
        System.out.print(count(8, 5));
        System.out.print(count(9, 5));
    }


    public static int count(int a, int b)
    {
        return a == b ? a * b : a + b;
    }
}
