package com.TasksJavaRush.Course_12;

/*
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
 */
public class Solution_9 {
    public void javaRush() {
        min(10, -10);
        min((long)10, -10);
        min(10.0, -10.0);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static long min(long a, long b) {
        return Math.min(a, b);
    }

    public static double min(double a, double b) {
        return Math.min(a, b);
    }

}
