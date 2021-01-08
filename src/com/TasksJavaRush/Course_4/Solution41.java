package com.TasksJavaRush.Course_4;
import java.io.IOException;
import java.util.Scanner;

/*
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.
 */
public class Solution41 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a < c)
            System.out.println(a);
        else if (b > a && b < c)
            System.out.println(b);
        else if (c > b && c < a)
            System.out.println(c);
        else if (a == b && a == c)
            System.out.println(a);
        else if (a == b && a != c)
            System.out.println(a);
        else if (b == c && b != a)
            System.out.println(b);
        else if (a == c && a != b)
            System.out.println(a);

    }
}
