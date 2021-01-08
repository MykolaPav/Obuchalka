package com.TasksJavaRush.Course_2;
/*
Написать функцию, которая возвращает минимум из двух чисел.
Подсказка:
Нужно написать тело существующей функции min.
 */
public class Solution16 {
    public void javaRush(){
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
    public int min(int a, int b){
        int  c;
        if (a<b)
            c = a;
        else
            c = b;
        return c;
//        if (a<b)
//            return a;
//        else return b;
    }
}
