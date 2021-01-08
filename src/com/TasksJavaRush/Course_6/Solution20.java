package com.TasksJavaRush.Course_6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде "The max is 25".
 */
public class Solution20 {
    public static int max = 100;

    public void javaRush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int max2 = a > b ? a : b;

        System.out.println(max + max2);
    }
}