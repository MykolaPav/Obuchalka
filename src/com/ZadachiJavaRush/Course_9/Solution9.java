package com.ZadachiJavaRush.Course_9;

import java.io.IOException;

/*
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
 */
public class Solution9 {
    public void javaRush() throws IOException {
        try {

            int[] m = new int[2];
            m[8] = 5;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}
