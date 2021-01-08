package com.TasksJavaRush.Course_2;
/*
Написать функцию, которая вычисляет минимум из трёх чисел.

Подсказка:
Нужно написать тело существующей функции min.
 */
public class Solution17 {
    public void javaRush(){
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
    public int min(int a, int b, int c){
        int f;
        if (a<b)
            f = a;
        else f = b;
        if (c < f)
            f = c;
        return f;
    }
}
