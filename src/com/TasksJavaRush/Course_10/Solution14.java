package com.TasksJavaRush.Course_10;

/*
Расставьте как можно меньше модификаторов static так, чтобы пример скомпилировался.
 */
public class Solution14 {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;
    public static void javaRush()  {
        Solution14 solution14 = new Solution14();
        solution14.A = 5;
        solution14.B = 5 * B;
        solution14.C = 5 * C * D;
        Solution14.D = 5 * D * C;

        Solution14.D = 5;
    }

    public int getA() {
        return A;
    }

}
