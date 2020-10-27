package com.ZadachiJavaRush.Course_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Задача: Программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку),
помещает их в HashMap и выводит на экран содержимое HashMap.
 */
public class Solution18 {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Solution18() {
        this.map = new HashMap<>();
    }
    public void javaRush()  throws Exception {
        Solution18 solution = new Solution18();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i <= 10; i++) {
            int index = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                    solution.map.put(index, name);

        }

        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
                System.out.println("Id=" + index + " Name=" + name);

        }
    }
}
