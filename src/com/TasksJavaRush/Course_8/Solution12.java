package com.TasksJavaRush.Course_8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/*
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
 */
public class Solution12 {
    public void javaRush() throws IOException {
        List<Integer> list = new ArrayList<>();
        int count = 1;
        int max = 1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 9; i++) {

            if (list.get(i).equals(list.get(i+1))) {
                count++;
            }
            else{
                count = 1;
            }
            if (max < count) {
                max = count;
            }
        }

        System.out.println(max);
    }
}
