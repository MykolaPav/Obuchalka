package com.TasksJavaRush.Course_7;
import java.io.IOException;
import java.util.Scanner;

/*
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой.
Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей."
или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.
 */
public class Solution6 {
    public void javaRush() throws IOException {
        int[] arr = new int[15];
        int even = 0;
        int odd = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
            if (i %2 == 0)
                even += arr[i];
            else if
            (i %2 != 0)
                odd += arr[i];
        }
        if (even > odd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        System.out.println(even);
        System.out.println(odd);
    }
}