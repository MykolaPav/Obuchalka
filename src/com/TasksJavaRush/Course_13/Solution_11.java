package com.TasksJavaRush.Course_13;
/*
1. Создать класс EnglishTranslator, который наследуется от Translator.
2. Реализовать все абстрактные методы.
3. Подумай, что должен возвращать метод getLanguage.
4. Программа должна выводить на экран
"Я переводчик с английского" путем вызова метода translate у объекта типа EnglishTranslator.
 */
public class Solution_11 {
    public void javaRush()  {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "Я переводчик с " + getLanguage();
        }
    }
    public static class EnglishTranslator extends Translator{

        @Override
        public String getLanguage() {
            return "английского";
        }
    }
}
