package com.ZadachiJavaRush.Course_12;

/*
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
"Кот", "Тигр", "Лев", "Бык", "Корова", "Животное".
 */
public class Solution_25 {
    public void javaRush() {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public String toString(String x) {
        x = "";
        return x;
    }

    public static String getObjectType(Object o) {

        return o.toString();
    }

    public static class Cat extends Animal {  //<--Классы наследуются!!
        @Override
        public String toString() {
            return "Cat";
        }
    }

    public static class Tiger extends Cat {
        @Override
        public String toString() {
            return "Tiger";
        }
    }

    public static class Lion extends Cat {
        @Override
        public String toString() {
            return "Lion";
        }
    }

    public static class Bull extends Animal {
        @Override
        public String toString() {
            return "Bull";
        }
    }

    public static class Cow extends Animal {
        @Override
        public String toString() {
            return "Cow";
        }
    }

    public static class Animal {
        @Override
        public String toString() {
            return "Animal";
        }
    }
}
