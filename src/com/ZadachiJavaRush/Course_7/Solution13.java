package com.ZadachiJavaRush.Course_7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот,
который для x%3, потом тот, который для x%2, потом последний.
 */
public class Solution13 {
    public static void javaRush() throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            list.add(sc.nextInt());
        }
        for(int i : list ) {
            if (i % 3 == 0) {
                list1.add(i);
            }
            if (i % 2 == 0) {
                list2.add(i);
            }
            if (i % 3 != 0 && i % 2 != 0){
                list3.add(i);
            }
        }
        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int x : list)
            System.out.println(x);
    }
}




