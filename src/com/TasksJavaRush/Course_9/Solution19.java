package com.TasksJavaRush.Course_9;

/*
Создай метод public static void divideByZero, в котором подели любое число на ноль
и выведи на экран результат деления.
Оберни вызов метода divideByZero в try..catch.
Выведи стек-трейс исключения используя метод exception.printStackTrace()
 */
public class Solution19 {
    public void javaRush() throws Throwable {
        try {
        divideByZero();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void divideByZero() {
            int i = 10 / 0;
            System.out.println(i);
    }
}
