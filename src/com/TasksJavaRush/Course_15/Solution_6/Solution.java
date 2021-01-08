package com.TasksJavaRush.Course_15.Solution_6;

/*
1. Программа должна выводить следующее:
Это double
Это Object
Это double
Это Integer
Это double

2. Удали реализации всех лишних методов
 */
public class Solution {
    public void javaRush() throws Exception {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }
    public static void print(Integer i) {
        System.out.println("Это Integer");
    }

//    public static void print(int i) {
//        System.out.println("Это Integer");
//    }

//    public static void print(Short i) {
//        System.out.println("Это Object");
//    }

    public static void print(Object i) {
        System.out.println("Это Object");
    }

    public static void print(double i) {
        System.out.println("Это double");
    }

//    public static void print(Double i) {
//        System.out.println("Это double");
//    }

//    public static void print(float i) {
//        System.out.println("Это Double");
//    }
}
