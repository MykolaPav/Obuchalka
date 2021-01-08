package com.TasksJavaRush.Course_5;

import java.io.IOException;
import java.util.Scanner;

/*
Текущая реализация: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
 */
public class Solution32 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b, int c, int d, int e) {
        return Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);

//        a=(a < b) ? a : b;
//        a=(a < c) ? a : c;
//        a=(a < d) ? a : d;
//        return  a=(a < e) ? a : e;


//        if (a <= b && a <= c && a <= d && a <= e) {
//            return a;
//        } else if (b <= a && b <= c && b <= d && b <= e) {
//            return b;
//        } else if (c <= a && c <= b && c <= d && c <= e) {
//            return c;
//        } else if (d <= a && d <= b && d <= c && d <= e) {
//            return d;
//        } else if (e <= a && e <= b && e <= c && e <= d) {
//            return e;
//        } else if (e == a && e == b && e == c && e == d) {
//            return a;
//        }
    }
}

