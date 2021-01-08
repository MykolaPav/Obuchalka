package com.TasksJavaRush.Course_9;

import java.io.IOException;

/*
Перехватить исключение, возникающее при выполнении кода:
int a = 42 / 0;
Вывести на экран тип перехваченного исключения.
 */
public class Solution7 {
    public void javaRush() throws IOException {
        //напишите тут ваш код
        try { int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }


        //напишите тут ваш код
    }
}
