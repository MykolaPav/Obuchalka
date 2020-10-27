package com.ZadachiJavaRush.Course_7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
 */
public class Solution8 {
    private static ArrayList<String> list;
    public void javaRush() throws IOException {
        list = new ArrayList<>();
        int max = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(i, sc.nextLine());
            if (list.get(i).length() > max);
                max = list.get(i).length();
        }
        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() == max)
                System.out.println(list.get(i));
        }
    }
}