package com.TasksJavaRush.Course_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
 Каждое слово - с новой строки.
 */
public class Solution31 {
    public void javaRush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        //isGreaterThan("a", "b");

        Arrays.sort(array);
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
