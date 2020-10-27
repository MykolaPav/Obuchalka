package com.ZadachiJavaRush.Course_2;
/*
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)

Подсказка:
Нужно написать тело двух существующих функций min.
 */
public class Solution18 {
    public static int min(int a, int b, int c, int d) {
        return (min(min(a,b),min(c,d)));
    }

    public static int min(int a, int b) {
        if (a < b)
            return a;
        else return b;
    }
    public void javaRush(){
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
