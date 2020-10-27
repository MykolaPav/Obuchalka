package com.ZadachiJavaRush.Course_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.
 */
public class Solution24 {
    public void javaRush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        Scanner scanner = new Scanner(string);
        while(scanner.hasNextLine()){
            string = scanner.next();
            System.out.print(string.toUpperCase().charAt(0)+string.substring(1) + " ");
        }

    }
}
