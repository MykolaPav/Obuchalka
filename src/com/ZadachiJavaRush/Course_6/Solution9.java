package com.ZadachiJavaRush.Course_6;

import java.io.IOException;
import java.util.Scanner;

/*
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() - читает с клавиатуры строку
int readInt() - читает с клавиатуры число
double readDouble() - читает с клавиатуры дробное число
boolean readBoolean() - читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false

Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.
 */
public class Solution9 {
    public static class ConsoleReader {
        public static String readString() throws Exception {
            Scanner sc1 = new Scanner(System.in);
            String  i1 = sc1.nextLine();
            return i1;
        }

        public static int readInt() throws Exception {
            Scanner sc2 = new Scanner(System.in);
            int i2 = sc2.nextInt();

            return i2;
        }

        public static double readDouble() throws Exception {
            Scanner sc3 = new Scanner(System.in);
            double i3 = sc3.nextDouble();
            return i3;
        }

        public static boolean readBoolean() throws Exception {
            Scanner sc4 = new Scanner(System.in);
            boolean i4 = sc4.nextBoolean();
            return i4;
        }


        public void javaRush() throws IOException {
            //
        }
    }

}
//
//public class ConsoleReader {
//
//    public static String readString() throws Exception {
//        Scanner scanner1 = new Scanner(System.in);
//        //напишите тут ваш код
//        String a = scanner1.nextLine();
//        return a;
//    }
//
////    public static int readInt() throws Exception {
////        Scanner scanner2 = new Scanner(System.in);
////        //напишите тут ваш код
////        int b = scanner2.nextInt();
////        return b;
////    }
////
////    public static double readDouble() throws Exception {
////        Scanner scanner3 = new Scanner(System.in);
////        //напишите тут ваш код
////        double c = scanner3.nextDouble();
////        return c;
////    }
////
////    public static boolean readBoolean() throws Exception {
////        Scanner scanner4 = new Scanner(System.in);
////        //напишите тут ваш код
////        boolean d = scanner4.nextBoolean();
////        return d;
////    }
////
////    public static void main(String[] args) throws Exception {
////
////
////
////    }
////}