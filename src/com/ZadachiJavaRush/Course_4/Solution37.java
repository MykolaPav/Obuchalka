package com.ZadachiJavaRush.Course_4;
import java.io.IOException;
/*
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
 */
public class Solution37 {
    public void javaRush() throws IOException {
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
