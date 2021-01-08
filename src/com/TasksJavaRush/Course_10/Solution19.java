package com.TasksJavaRush.Course_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.
Каждую пару с новой строки.

Пример ввода:  Пример вывода:
1              1 Мыла
Мама           2 Рама
2              1 Мама
Рама
1
Мыла
 */
public class Solution19 {

    static Integer  index;
    static String name;

    public void javaRush() throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String  index = reader.readLine();
            if (index.isEmpty()) {
                break;
            }
            String  name = reader.readLine();
            map.put(name, Integer.parseInt(index));
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            name = pair.getKey();
            index = pair.getValue();
            System.out.println(index + " " + name);
        }
    }
}
