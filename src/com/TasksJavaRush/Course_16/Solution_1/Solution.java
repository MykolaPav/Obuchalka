package com.TasksJavaRush.Course_16.Solution_1;
/*
Создать public static class TestThread - нить с интерфейсом Runnable.
TestThread должен выводить в консоль "My first thread".
 */

public class Solution {
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
