package com.TasksJavaRush.Course_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.
 */
public class Solution19 {
    public void javaRush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String a1 = reader.readLine();
        String a2 = reader.readLine();

        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(a2);

        System.out.println(name + " получает " + a + " через " + b + " лет.");

    }
}
