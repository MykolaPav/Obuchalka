package com.ZadachiJavaRush.Course_2;
/*
Выведи на экран длину окружности, рассчитанную по формуле: L = 2 * Pi * radius.
Результат - дробное число (тип double).
В качестве значения Pi используй значение 3.14.

public static void main(String[] args) {
        printCircleLength(5);
    }
     public static void printCircleLength(int radius) {
        double L;
 double Pi = 3.14;
 L = 2 * Pi * radius;
 System.out.println(L);
    }
 */
public class Solution3 {
    public void javaRush(){
        printCircleLength(5);
    }
    public static void printCircleLength(int radius) {
        double L;
        double Pi = 3.14;
        L = 2 * Pi * radius;
        System.out.println(L);
    }
}