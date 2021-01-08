package com.TasksJavaRush.Course_6;
import java.io.IOException;

/*
Переставь один модификатор static, чтобы пример скомпилировался.
 */
public class Solution15 {
    public static int A = 5;
    public int B = 2;
    public int C = A * B;
    public static void javaRush() throws IOException {
        A = 15;
    }
}