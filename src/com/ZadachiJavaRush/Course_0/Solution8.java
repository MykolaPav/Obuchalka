package com.ZadachiJavaRush.Course_0;
/*
Раскомментируй одну строчку,
чтобы программа вывела на экран числа 12 и 2
(сначала 12, а затем 2).
 */
public class Solution8 {
    public void javaRush() {
        int x = 2;
        int y = 12;

        // y = x * y;
         y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
