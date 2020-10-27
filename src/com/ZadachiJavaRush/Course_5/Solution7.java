package com.ZadachiJavaRush.Course_5;
import java.io.IOException;
import java.util.Scanner;

/*
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
 */
public class Solution7 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        double num = 0;
        double sum = 0;
        double count = 0;
        double mid = 0.0;

        while (true) {
            num = sc.nextInt();

            if (num == -1)break;
            else {
                sum += num;
                count++;
            }
        }
       mid = sum/count;
        System.out.println(mid);


    }
}
