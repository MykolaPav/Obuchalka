package com.TasksJavaRush.Course_20.Solution_10;

import java.io.Serializable;

/**
 * Сделайте так, чтобы сериализация класса Object была возможной.
 */
public class Solution  {

    //тут нужно имплементировать Serializable
    public static class Object implements Serializable {
        public String string1;
        public String string2;
    }

    public static int stringCount;
    //тут нужно имплементировать Serializable
    public static class String implements Serializable {
        private final int number;

        public String() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }

    public void javaRush() {

    }
}

