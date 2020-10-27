package com.ZadachiJavaRush.Course_4;
/*
Напишите метод displayClosestToTen.
Метод должен выводить на экран ближайшее к 10 из двух чисел,
записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11.
Если оба числа на равной длине к 10, то вывести на экран любое из них.
Подсказка:
используйте метод public static int abs(int a), который возвращает абсолютную величину числа.
 */
public class Solution9 {
    public void javaRush() {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }
    public static void displayClosestToTen(int a, int b) {
//        System.out.println((abs(a-10)<abs(b-10))?a:b);

//        int a1 = abs(a - 10);
//        int a2 = abs(b - 10);
//        System.out.println((a1 == a2) ? a : (a1 < a2) ? a : b);

        if (abs(10-a)>abs(10-b)){
            System.out.println(b);
        } else
            System.out.println(a);
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
