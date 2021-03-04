package com.My.random.arcount;

public class MainRun
{
    private static int a;
    public static void print(int x)
    {
        System.out.println(x);
    }

    public static void mathRandom()
    {
        print(a = (int) (Math.random() * 50));
    }
}
