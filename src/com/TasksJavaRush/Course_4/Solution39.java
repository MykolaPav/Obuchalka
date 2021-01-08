package com.TasksJavaRush.Course_4;
import java.io.IOException;
import java.util.Scanner;

/*
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.
Пример вывода на экран для имени Света:
Света любит меня.
 */
public class Solution39 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(a + " любит меня");
        }
    }
}
