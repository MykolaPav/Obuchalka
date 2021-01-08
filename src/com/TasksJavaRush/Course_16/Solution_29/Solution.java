package com.TasksJavaRush.Course_16.Solution_29;

/*
Разберись, как работает программа.
По образу и подобию CountdownRunnable создай нить CountUpRunnable,
которая выводит значения в нормальном порядке - от 1 до number
 */

public class Solution {
    public static int number = 5;

    public void javaRush() throws Exception {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {
        //Add your code here - добавь код тут
        private int countIndexUp = 1;
        public void run() {
            try {
                while (countIndexUp != 6) {
                    Thread.sleep(500);
                    System.out.println(toString());
                    countIndexUp += 1;
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
