package com.TasksJavaRush.Course_7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
 */
public class Solution18 {
    public void javaRush() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextLine());
        }
            for (int i = 0; i < list.size() -1; ) {
                if (list.get(i).length() < list.get(i+1).length())
                    i++;
                else if (list.get(i).length() == list.get(i+1).length())
                    i++;
                else if (list.get(i).length() > list.get(i+1).length()){
                    System.out.println(i + 1);
                    break;
                }
            }

    }
}
