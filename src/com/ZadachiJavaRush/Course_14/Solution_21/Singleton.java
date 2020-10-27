package com.ZadachiJavaRush.Course_14.Solution_21;

public class Singleton {
    private static volatile Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
}
