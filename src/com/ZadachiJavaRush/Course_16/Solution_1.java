package com.ZadachiJavaRush.Course_16;
/*
Создать public static class TestThread - нить с интерфейсом Runnable.
TestThread должен выводить в консоль "My first thread".
 */

public class Solution_1 {
    public void javaRush() throws Exception {
        TestThread task = new TestThread();
        new Thread(task).start();
    }
    public static class TestThread implements Runnable {
        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }
}
