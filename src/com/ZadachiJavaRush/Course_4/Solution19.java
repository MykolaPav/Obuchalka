package com.ZadachiJavaRush.Course_4;

import java.util.Scanner;

/*
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.
 */
public class Solution19 {
    public void javaRush() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a==b && a==c && a==d && d==c && d==b)
            System.out.println(a);
        else if (a >= b && a >= c && a >= d)
            System.out.println(a);
        else if (b >= a && b >= c && b >= d)
            System.out.println(b);
        else if (c >= a && c >= b && c >= d)
            System.out.println(c);
        else if (d >= a && d >= c && d >= b)
            System.out.println(d);


//        System.out.println(a >= b && a >= c && a >= d ? a : b >= a && b >= c && b >= d ? b : c >= a && c >= b && c >= d ? c : d);
    }
}
