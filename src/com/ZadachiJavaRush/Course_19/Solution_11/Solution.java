package com.ZadachiJavaRush.Course_19.Solution_11;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
 * Твоя ридер-обертка должна преобразовывать весь текст в заглавные буквы.
 * Вызови готовый метод printSomething(), воспользуйся testString.
 * Верни переменной System.out первоначальный поток.
 * Выведи модифицированную строку в консоль.
 */
public class Solution {
    public static TestString testString = new TestString();
    public void javaRush() throws Exception {
        PrintStream firstStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream secondStream = new PrintStream(outputStream);
        System.setOut(secondStream);
        //
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(firstStream);
        System.out.println(result.toUpperCase());
        //
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
