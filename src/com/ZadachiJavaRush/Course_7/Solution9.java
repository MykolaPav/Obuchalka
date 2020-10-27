package com.ZadachiJavaRush.Course_7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
 */
public class Solution9 {
    public void javaRush() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            list.add(i, sc.nextLine());
            if (min > list.get(i).length())
                min = list.get(i).length();
        }
        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() == min)
                System.out.println(list.get(i));
        }
    }
}
