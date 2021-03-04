package com.TasksJavaRush.Course_16.Solution_22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. Нить 1 должна бесконечно выполняться;
1.2. Нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. Нить 3 должна каждые полсекунды выводить "Ура";
1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. Нить 5 должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.

Подсказка:
Нить 4 можно проверить методом isAlive()
 */
public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();
        ThreadTwo threadTwo = new ThreadTwo();
        threadTwo.start();
        ThreadThree threadThree = new ThreadThree();
        threadThree.start();
        ThreadFour threadFour = new ThreadFour();
        threadFour.start();
        ThreadFive threadFive = new ThreadFive();
        threadFive.start();
    }
    static {
        threads.add(new ThreadOne());
        threads.add(new ThreadTwo());
        threads.add(new ThreadThree());
        threads.add(new ThreadFour());
        threads.add(new ThreadFive());
    }

    public static class ThreadOne extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class ThreadTwo extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }
    public static class ThreadThree extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class ThreadFour extends Thread implements  Message {
        @Override
        public void run() {
            while (!this.interrupted()) { }
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }
    public static class ThreadFive extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        @Override
        public void run() {
            while (true) {
                try {
                    String str = reader.readLine();
                    if (str.equals("N")) break;
                    count += Integer.parseInt(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println(count);
        }
    }
}
