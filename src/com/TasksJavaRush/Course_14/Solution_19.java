package com.TasksJavaRush.Course_14;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.
 */
public class Solution_19 {
    public static List<Exception> exceptions = new ArrayList<Exception>();


    public void javaRush() throws Throwable {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
//1
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        int[] x = new int[1];
//2
        try {
             x[4] = 5;
        }
        catch (Exception e) {
            exceptions.add(e);
            exceptions.add(new NullPointerException());
            exceptions.add(new InterruptedException());
            exceptions.add(new IllegalAccessException());
            exceptions.add(new IllegalArgumentException());
            exceptions.add(new NumberFormatException());
            exceptions.add(new IllegalMonitorStateException());
            exceptions.add(new IllegalStateException());
            exceptions.add(new IOException());
        }
    }
}
