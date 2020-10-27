package com.ZadachiJavaRush.Course_9;

import java.io.IOException;

/*
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать свой StackTrace.
 */
public class Solution1 {
    public void javaRush() throws IOException {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        method3();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3() {
        method4();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        method5();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        return Thread.currentThread().getStackTrace();
    }
}
