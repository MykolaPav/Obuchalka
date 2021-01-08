package com.TasksJavaRush.Course_2;
/*
Метод convertCelsiusToFahrenheit(int celsius) принимает значение в градусах Цельсия.
Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
(C * 9/5D)+32

Пример:
В метод convertCelsiusToFahrenheit на вход подается значение 41.

Пример вывода:
105.8
 */
public class Solution6 {
    public void javaRush(){
        System.out.println(convertCelsiusToFahrenheit(32));
    }
    public static double convertCelsiusToFahrenheit(int celsius) {
        return celsius*9/5D+32;
    }
}
