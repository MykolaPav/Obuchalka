package com.TasksJavaRush.Course_4;
import java.io.IOException;
import java.util.Scanner;

/*
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
 */
public class Solution36 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("8");
            }
            System.out.println("");
        }
    }
}
