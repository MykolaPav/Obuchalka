package TasksJavaRush.Course_5;

import java.io.IOException;
import java.util.Scanner;

/*
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
 */
public class Solution33 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int max = Integer.MIN_VALUE;

        if (num1 <= 0) {
            System.out.println();
        }

        if (num1 > 0) {
            for (int i = 0; i < num1; i++) {
                int count = sc.nextInt();
                if (count > max)
                    max = count;
            }
            System.out.println(max);
        }
    }
}
