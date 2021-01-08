package com.TasksJavaRush.Course_10;

/*
Добавить одну операцию по преобразованию типа, чтобы получался ответ: b = 0
float f = (float)128.50;
int i = (int)f;
int b = (int)(i + f);
 */
public class Solution3 {
    public void javaRush()  {
        float f = (float) 128.50;
        int i = (int) f;
        float g = (float) (i=-128);
        int b = (int) (i + f);
        System.out.println(b);
    }
}
