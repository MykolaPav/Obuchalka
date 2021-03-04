package com.multithreading;

/**
 * Внутренний статический клас унаследован от класса Tread
 * переопределяет его, и метод main запускает нить
 */
public class ThreadExample_2 {
    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.start();
    }
    public static class TestThread extends Thread{
        @Override
        public void run() {
            System.out.println("It's a run method");
        }

        static
        {
            System.out.println("It's a static bloc inside thread");
        }
    }
}
