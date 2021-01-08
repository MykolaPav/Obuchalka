package com.TasksJavaRush.Course_19.Solution_14;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 *В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
 * Твоя ридер-обертка должна выводить на консоль решенный пример.
 * Вызови готовый метод printSomething(), воспользуйтесь testString.
 * Верни переменной System.out первоначальный поток.
 *
 * Возможные операции: + - *
 * Шаблон входных данных и вывода: a [знак] b = c
 * Отрицательных и дробных чисел, унарных операторов - нет.
 *
 * Пример вывода:
 * 3 + 6 = 9
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
        String result = outputStream.toString().trim();
        String[] stringMass = result.split(" ");
        int x;
        switch (stringMass[1]) {
            case "+" : x = Integer.parseInt(stringMass[0]) + Integer.parseInt(stringMass[2]);
                break;
            case "-" : x = Integer.parseInt(stringMass[0]) - Integer.parseInt(stringMass[2]);
                break;
            case "*" : x = Integer.parseInt(stringMass[0]) * Integer.parseInt(stringMass[2]);
                break;
            default: x = -1;
                break;
        }
        //
        System.setOut(firstStream);
        System.out.print(result + " " + x);
    }
    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}
