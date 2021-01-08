package com.TasksJavaRush.Course_4;
import java.io.IOException;

/*
Вывести на экран числа от 10 до 1 используя цикл while. Каждое значение с новой строки.
 */
public class Solution31 {
    public void javaRush() throws IOException {
        int a = 10;
        while (a >= 1) {
            System.out.println(a);
            a--;
        }
    }
}
