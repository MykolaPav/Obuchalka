package TasksJavaRush.Course_12;
/*
Написать public static методы: int max(int, int), long max(long, long), double max(double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
 */
public class Solution_10 {
    public void javaRush()  {
        max(10, -10);
        max((long)10, -10);
        max(10.0, -10.0);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static long max(long a, long b) {
        return Math.max(a, b);
    }

    public static double max(double a, double b) {
        return Math.max(a, b);
    }
}
