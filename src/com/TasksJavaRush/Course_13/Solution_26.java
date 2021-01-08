package com.TasksJavaRush.Course_13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:     Пример вывода:
5                 -2
8                 2
-2                8
11                10
3
-5
2
10
"C:\\Users\\CMDR_\\OneDrive\\Рабочий стол\\Test\\File.txt"
C:\Users\CMDR_\OneDrive\Рабочий стол\Test\File.txt
 */
public class Solution_26 {
    public void javaRush() throws Exception {
        List<Integer> list = new ArrayList<>();

        BufferedReader pathName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(pathName.readLine())));
        pathName.close();

        while (reader.ready()){
            int numbers = Integer.parseInt(reader.readLine());
            if(numbers %2 == 0)
                list.add(numbers);
        }

        Collections.sort(list);
        for (Integer x : list) {
            System.out.println(x);
        }
        reader.close();
    }
}
