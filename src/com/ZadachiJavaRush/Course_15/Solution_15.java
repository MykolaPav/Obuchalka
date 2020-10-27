package com.ZadachiJavaRush.Course_15;

import java.util.Scanner;

/*
1. В статическом блоке считайте две переменные с консоли А и В с типом int.
2. Не забыть про IOException, который надо обработать в блоке catch.
3. Закрыть поток ввода методом close().
 */
public class Solution_15 {
    public static int A;
    public static int B;
    static {
        try {
            Scanner sc = new Scanner(System.in);
            A = sc.nextInt();
            B = sc.nextInt();
            sc.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static final int MIN = min(A, B);
    public void javaRush()  {
        System.out.println(MIN);
    }
    public static int min(int a, int b) {
        return a < b ? a : b;
    }

}
