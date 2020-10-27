package com.ZadachiJavaRush.Course_2;
/*
В методе main создай объект Man, сохрани ссылку на него в переменную man.
Создай также объект Woman и сохрани ссылку на него в переменную woman.

Подсказка: для создания объекта Woman и занесения его ссылки в переменную woman используй конструкцию:
ТипПеременной имяПеременной = new ТипСоздаваемогоОбъекта();
В man.wife сохрани ссылку на ранее созданный объект Woman.
В woman.husband сохрани ссылку на ранее созданный объект Man (подсказка: woman.husband = man
 */
public class Solution7 {
    public static void javaRush(){
        Man man = new Man();
        Woman woman = new Woman();

        man.wife = woman;
        woman.husband = man;
    }

    public static class Man{
        public int age;
        public int height;
        public Woman wife;
    }
    public static class Woman{
        public int age;
        public int height;
        public Man husband;
    }
}
//public class Solution {
//    public static void main(String[] args) {
//        Man man = new Man();
//
//        Woman woman = new Woman();
//
//        woman.husband = man;
//        man.wife = woman;
//    }
//
//    public static class Man {
//        public int age;
//        public int height;
//        public Woman wife;
//    }
//
//    public static class Woman {
//        public int age;
//        public int height;
//        public Man husband;
//    }
//}
