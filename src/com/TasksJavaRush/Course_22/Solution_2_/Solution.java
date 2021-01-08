package com.TasksJavaRush.Course_22.Solution_2_;

/*
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null || string.isEmpty()) throw new TooShortStringException();
        return  null;
    }

    public static class TooShortStringException extends Throwable {
    }
}