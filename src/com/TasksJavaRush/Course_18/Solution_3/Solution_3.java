package com.TasksJavaRush.Course_18.Solution_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.util.Collections.frequency;

/*
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.
*/
public class Solution_3 {

    public void javaRush() throws Exception {
        //C:\Users\CMDR_\OneDrive\Рабочий стол\Test\File1.txt
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        try (FileInputStream inStr = new FileInputStream(
                new BufferedReader(
                        new InputStreamReader(System.in)).readLine())) {
                             while (inStr.available() > 0)
                                    list1.add(inStr.read()
                );}

        int count = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (frequency(list1, list1.get(i)) > count) {
                count = frequency(list1, list1.get(i));
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            if (frequency(list1, list1.get(i)) == count) {
                if(!list2.contains(list1.get(i))) {
                    System.out.println(list1.get(i) + "");
                    list2.add(list1.get(i));
                }
            }
        }
    }
}
