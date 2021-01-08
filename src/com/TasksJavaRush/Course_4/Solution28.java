package com.TasksJavaRush.Course_4;
import java.io.IOException;
import java.util.Scanner;

/*
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
 */
public class Solution28 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int countUp = 0;

        {
            if (a > 0) countUp++;
            if (b > 0) countUp++;
            if (c > 0) countUp++;
        }
        if (countUp > 0)
            System.out.println(countUp);
        else
            System.out.println(0);
    }
}
