package com.My.Moltithreading.multithreading;

/**
 * Внутренний статический клас который реализует интерфейс Runnable
 * Метод main создаёт экземпляр этого класса и запускает нить.
 */
public class ThreadExample {
    public static void main(String[] args) {
        TestThread testThread = new TestThread();
            new Thread(testThread).start();
    }
    public static class TestThread implements Runnable{
        int count = 0;
        @Override
        public void run() {
            count++;
            System.out.println("My "+ count+" message");
        }
    }
}
