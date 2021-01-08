package com.TasksJavaRush.Course_7;
import java.io.IOException;
import java.util.Scanner;

/*
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
 */
public class Solution4 {
    public void javaRush() throws IOException {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = a.length -1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
