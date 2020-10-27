package com.ZadachiJavaRush.Course_16;

/*
1. Разберись, как работает программа.
2. Не меняя классы T1 и T2 сделай так, чтобы их нити завершились, не обязательно успешно.
3. Метод sleep не использовать.
 */

public class Solution_25 {
    static Thread t1 = new T1();
    static Thread t2 = new T2();
    public void javaRush() throws Exception {
        t1.start();
        t1.interrupt();
        t2.start();
    }

    public static class T1 extends Thread {
        @Override
        public void run() {
            try {
                t2.join();
                System.out.println("T1 finished");
            } catch (InterruptedException e) {
                System.out.println("T1 was interrupted");
            }
        }
    }

    public static class T2 extends Thread {
        @Override
        public void run() {
            try {
                t1.join();
                throw new InterruptedException();
                //System.out.println("T2 finished");
            } catch (InterruptedException e) {
                System.out.println("T2 was interrupted");
            }
        }
    }
}
