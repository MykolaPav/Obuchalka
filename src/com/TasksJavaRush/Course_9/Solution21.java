package com.TasksJavaRush.Course_9;

import java.util.Scanner;

/*
Написать программу, которая будет вводить числа с клавиатуры.
Код по чтению чисел с клавиатуры должен быть в методе readData.
Код внутри readData обернуть в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа,
то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
 */
public class Solution21 {
    public void javaRush() {
        readData();
    }

    public static void readData() {

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int str = sc.nextInt();
                System.out.println(str);
            } catch (Throwable e) {
                break;
            }

        }
    }
}
