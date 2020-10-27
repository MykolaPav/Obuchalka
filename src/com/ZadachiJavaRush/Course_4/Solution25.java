package com.ZadachiJavaRush.Course_4;
import java.io.IOException;
import java.util.Scanner;
/*
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.
Пример для чисел 4 6:
1
Пример для чисел -6 -6:
3
 */
public class Solution25 {
    public void javaRush() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((a>0 && b>0)? 1 :(a<0 && b>0)? 2: (a<0 && b<0)? 3: (a>0 && b<0)? 4: null);
    }
}
