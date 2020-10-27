package com.ZadachiJavaRush.Course_19.Solution_15;

import java.io.*;

/**
 * Считай с консоли имя файла.
 * В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
 * Твоя ридер-обертка должна выводить весь текст и на консоль и в файл, имя которого ты считал.
 * Вызови готовый метод printSomething(), воспользуйся testString.
 * Верни переменной System.out первоначальный поток.
 * Закрой поток файла.
 *
 * Пример вывода на экран:
 * it's a text for testing
 *
 * Пример тела файла:
 * it's a text for testing
 * C:\Users\CMDR_\OneDrive\Рабочий стол\Test\File1.txt
 */
public class Solution {
    public static TestString testString = new TestString();

    public void javaRush() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        PrintStream firstStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream secondStream = new PrintStream(outputStream);
        System.setOut(secondStream);

        FileOutputStream fos = new FileOutputStream(file);
        //
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(firstStream);
        outputStream.writeTo(fos);

        System.out.println(result);

        fos.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
