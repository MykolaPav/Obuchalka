package com.My.random.arcount;

import java.util.Random;

public class Main extends MainRun
{
    final static int x = ran();
    final static int y = ran();
    final static int z = ran();
    public static void main(String[] args)
    {
        ran();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    private static int ran(){
        Random random = new Random();
        return random.nextInt(50);
    }
}
