package com.ZadachiJavaRush.Course_15;

/*
1. Изменить метод printName так, чтобы он выполнялся для man и woman.
2. Реализация метода printName должна быть одна.
 */
public class Solution_9 {
    public void javaRush() throws Exception {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }
    public static void printName(Human man) {

    }

    public static class Human {

    }

    public static class Man extends Human {

    }

    public static class Woman extends Human{

    }
}
