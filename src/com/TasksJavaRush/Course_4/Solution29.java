package com.TasksJavaRush.Course_4;
import java.io.IOException;
import java.util.Scanner;

/*
Ввести с клавиатуры три целых числа.
Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а",
"количество положительных чисел: б",
где а, б - искомые значения.
 */
public class Solution29 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int countUp = 0;
        int countD = 0;

        {
            if (a > 0) countUp++;
            if (b > 0) countUp++;
            if (c > 0) countUp++;
            if (a < 0) countD++;
            if (b < 0) countD++;
            if (c < 0) countD++;
        }
        if (countUp > 0) {
            System.out.println("Положительных чисел: " + countUp);
        }
        if (countD > 0) {
            System.out.println("Отрицательных чисел: " + countD);
        }
    }
}
