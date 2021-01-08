package com.TasksJavaRush.Course_4;
import java.io.IOException;
import java.util.Scanner;

/*
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.
 */
public class Solution42 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);

        int b = 0;
        while (true) {
            int a = sc.nextInt();
            b = b + a;

            if (a==-1){break;}
        }
        System.out.println(b);
    }
}
