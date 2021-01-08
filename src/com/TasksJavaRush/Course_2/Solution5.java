package com.TasksJavaRush.Course_2;
/*
В классе Person объяви следующие переменные:
name типа String, age типа int, weight типа int, money типа int.
В методе main создай объект Person,
занеси его ссылку в переменную person.

Подсказка: для создания объекта Person и занесения его ссылки
в переменную person используй конструкцию:
ТипПеременной имяПеременной = new ТипСоздаваемогоОбъекта();
 */
public class Solution5 {
    public void javaRush(){
        Person person = new Person();
    }
    public class Person{
        String name = "Nick";
        int age = 25;
        int weight = 75;
        int money = 100;
    }
}
