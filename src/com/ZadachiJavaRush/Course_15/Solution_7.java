package com.ZadachiJavaRush.Course_15;

/*
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
 */
public class Solution_7 {
    public void javaRush() throws Exception {
        printMatrix(2, 3, "8");
    }
    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int a){}
    public static void printMatrix(double x){}
    public static void printMatrix(String s){}
    public static void printMatrix(Object object){}
    public static void printMatrix(Integer integer){}
    public static void printMatrix(int x , double y){}
    public static void printMatrix(double y, int x){}
    public static void printMatrix(String s, int x){}
}
