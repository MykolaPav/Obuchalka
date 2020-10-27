package com.ZadachiJavaRush.Course_19.Solution_12;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * В методе main подмените объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
 * Твоя ридер-обертка должна заменять все подстроки "te" на "??".
 * Вызови готовый метод printSomething(), воспользуйтесь testString.
 * Верни переменной System.out первоначальный поток.
 * Выведи модифицированную строку в консоль.
 */
public class Solution {
    public static TestString testString = new TestString();

    public  void javaRush() {
        PrintStream firstStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream secondStream = new PrintStream(outputStream);
        System.setOut(secondStream);
        //
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(firstStream);
        System.out.println(result.replaceAll("te","??"));
    }
    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
