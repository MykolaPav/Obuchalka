package com.ZadachiJavaRush.Course_4;
import java.io.IOException;
import java.util.Scanner;

/*
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
"Меня зовут name.
Я родился d.m.y"
Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988
 */
public class Solution43 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println("Меня зовут " + a);
        System.out.println("Я родился " + b + "." + c + "." + d);
    }
}
