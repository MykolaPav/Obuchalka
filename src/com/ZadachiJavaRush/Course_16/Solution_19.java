package com.ZadachiJavaRush.Course_16;

/*
Разберись, как работает программа.
Сделай так, чтобы в методе ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась сама.
Нельзя использовать метод interrupt.
 */

public class Solution_19 {
    public static boolean cancel = false;

    public void javaRush() throws Exception {
        Solution_19 sol = new Solution_19();
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        cancel = true;
    }

    public static class TestThread implements Runnable {

        public void run() {
            while (!cancel) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
