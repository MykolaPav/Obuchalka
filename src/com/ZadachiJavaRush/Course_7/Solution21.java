package com.ZadachiJavaRush.Course_7;
import java.io.IOException;
import java.util.Scanner;

/*
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
 */
public class Solution21 {
    public void javaRush() throws IOException {
        //ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
           // list.add(sc.nextInt());
            arr[i]  = sc.nextInt();
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
//        for (int i = 0; i < arr.length; i++) {
//            if (i > max)
//                max = i;
//            if (i < min)
//                min = i;
//        }

//        for (int x: list) {
//            if (x > max)
//                max = x;
//            if (x < min)
//                min = x;
//        }
        System.out.println(min);
        System.out.println(max);
    }
}
