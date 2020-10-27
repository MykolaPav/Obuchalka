package com.ZadachiJavaRush.Course_6;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

/*
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
 */
public class Solution22 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int[] arr = new int[]{a,b,c,d,e};
        for (int i = 0; i < 5; i++) {
               Arrays.sort(arr, 0, 5);
            System.out.println(arr[i]);
        }

    }
}