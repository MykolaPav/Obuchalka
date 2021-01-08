package com.TasksJavaRush.Course_7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.
 */
public class Solution20 {
    public void javaRush() throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> list = new ArrayList<>();
//        //напишите тут ваш код
//        int N = Integer.parseInt(reader.readLine());
//        int M = Integer.parseInt(reader.readLine());
//        for (int i = 0; i < N; i++){
//            list.add(reader.readLine());
//        }
//        for (int i=0;i<M;i++){
//            list.add(list.get(0));
//            list.remove(0);
//        }
//
//        for (int i=0; i<list.size();i++){
//            System.out.println(list.get(i));
//        }

        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        for (int i = 0; i < m; i++) {
            list.add(list.get(0));
            list.remove(0);
        }
        for (String x : list) {
            System.out.println(x);
        }
    }
}