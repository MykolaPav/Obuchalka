package com.TasksJavaRush.Course_4;
import java.util.Scanner;
/*
Ввести с клавиатуры три целых числа.
Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
 */
public class Solution24 {
    public void javaRush() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ( a== b && b != c)
            System.out.println(3);
        else if (b == c && c != a)
            System.out.println(1);
        else if (c == a && a!= b)
            System.out.println(2);
//        else if (a!=b&&a!=c&&b!=c)
//            System.out.println("");
    }
}
