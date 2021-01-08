package com.TasksJavaRush.Course_19.Solution_13;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
 * Твоя ридер-обертка должна выводить только цифры.
 * Вызови готовый метод printSomething(), воспользуйтесь testString.
 * Верни переменной System.out первоначальный поток.
 * Выведи модифицированную строку в консоль.
 *
 * Пример вывода:
 * 12345678
 */
public class Solution {
    public static TestString testString = new TestString();
    public void javaRush() {
        PrintStream firstStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream secondStream = new PrintStream(outputStream);
        System.setOut(secondStream);
        //
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(firstStream);
        System.out.println(result.replaceAll("\\D",""));
    }
    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
