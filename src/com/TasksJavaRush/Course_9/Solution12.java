package com.TasksJavaRush.Course_9;

import java.io.IOException;

/*
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int num=Integer.parseInt("XYZ");
System.out.println(num);
 */
public class Solution12 {
    public void javaRush() throws IOException {
        try {

            int num = Integer.parseInt("XYZ");
            System.out.println(num);

        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }
    }
}
