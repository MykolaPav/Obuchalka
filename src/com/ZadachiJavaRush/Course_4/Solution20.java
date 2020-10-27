package com.ZadachiJavaRush.Course_4;

import java.util.Scanner;

/*
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.
 */
public class Solution20 {
    public void javaRush() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if      ((a <= b && a <= c)&& (b <= c))
            System.out.println(a + " " + b + " " + c);
        else if ((a <= b && a <= c)&& (c <= b))
            System.out.println(a + " " + c + " " + b);

        else if ((b <= a && b <= c)&& (c <= a))
            System.out.println(b + " " + c + " " + a);
        else if ((b <= a && b <= c)&& (a <= c))
            System.out.println(b + " " + a + " " + c);

        else if ((c <= b && c <= a)&& (b <= a))
            System.out.println(c + " " + b + " " + a);
        else if ((c <= b && c <= a)&& (a <= b))
            System.out.println(c + " " + a + " " + b);
    }
}
