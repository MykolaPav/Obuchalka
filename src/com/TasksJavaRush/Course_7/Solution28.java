package com.TasksJavaRush.Course_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
 */
public class Solution28 {
    public void javaRush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }
    public static void sort(int[] array) {
        //Collections.sort(array);
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
