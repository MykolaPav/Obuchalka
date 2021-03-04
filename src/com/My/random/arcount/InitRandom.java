package com.My.random.arcount;

import java.util.Random;

public class InitRandom
{
    PrintRandom pr = new PrintRandom();
    Random random = new Random();
    private int a, b, c;

    public int mathRandom(){
        return a = random.nextInt(50);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
