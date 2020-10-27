package com.ZadachiJavaRush.Course_3;
/*
Реализуй метод public static void writeToConsole(String s),
который добавляет к началу строки выражение "printing: " и выводит измененную строку на экран.

Пример вывода для "Hello world!":
printing: Hello world!
 */
public class Solution11 {
    public void javaRush(){
        writeToConsole("Hello world!");
    }
    public static void writeToConsole(String s) {
        String a = "printing: ";
        System.out.println(a + s);
    }
}
