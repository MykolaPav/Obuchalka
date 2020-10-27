package com.ZadachiJavaRush.Course_6;

import java.io.IOException;

/*
Сделать класс Calculator, у которого будут 5 статических методов:
int plus(int a, int b) - возвращает сумму чисел a и b
int minus(int a, int b) - возвращает разницу чисел a и b
int multiply(int a, int b) - возвращает результат умножения числа a на число b
double division(int a, int b) - возвращает результат деления числа a на число b
double percent(int a, int b) - возвращает b процентов от числа a (например, percent(4, 50) должен вернуть 50% от 4)
 */
public class Solution12 {
    int x;
    double y;

    public int plus(int a, int b) {
        x = a + b;
        return x;
    }

    public int minus(int a, int b) {
        x = a - b;
        return x;
    }

    public int multiply(int a, int b) {
        x = a * b;
        return 0;
    }

    public double division(int a, int b) {

        return (double) a / b;
    }

    public double percent(int a, int b) {

        return (double) a * 0.01 * b;
    }

    public void javaRush() throws IOException {
        //
    }
}


//public class Calculator {
//    static int z;
//    static int x;
//    static int c;
//    static int v;
//    static int q;
//    public static int plus(int a, int b) {
//        //напишите тут ваш код
//        z = a + b;
//        return z;
//    }
//
//    public static int minus(int a, int b) {
//        //напишите тут ваш код
//        x = a - b;
//        return x;
//    }
//
//    public static int multiply(int a, int b) {
//        //напишите тут ваш код
//        c = a * b;
//        return c;
//    }
//
//    public static double division(int a, int b) {
//        //напишите тут ваш код
//        return (double)a/b;
//    }
//
//    public static double percent(int a, int b) {
//        //напишите тут ваш код
//        return (double)a*0.01*b;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}