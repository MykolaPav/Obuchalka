package com.ZadachiJavaRush.Course_18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/*
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.

Пример байт входного файла:
44 83 44

Пример вывода:
44 83
*/
public class Solution_5 {

    public void javaRush() throws Exception {
        HashSet<Integer> list = new HashSet<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        FileInputStream fin = new FileInputStream(file);
        while (fin.available() > 0) {
            list.add(fin.read());
        }
        for (Integer x : list){
            list2.add(x);
        }
        Collections.sort(list2);
        for (Integer x : list2){
            System.out.print(x + " ");
        }

        reader.close();
        fin.close();
    }

}
