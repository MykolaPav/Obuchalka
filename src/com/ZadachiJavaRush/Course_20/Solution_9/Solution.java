package com.ZadachiJavaRush.Course_20.Solution_9;

import java.io.Serializable;

/**
 * Сделай так, чтобы сериализация класса ClassWithStatic была возможной.
 */
public class Solution {
    //тут нужно имплементировать Serializable в статический класс
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;
    }
    public void javaRush() {

    }
}
