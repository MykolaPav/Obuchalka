package com.TasksJavaRush.Course_13;
/*
Исправить код так, чтобы программа выполнялась и выводила "Я переводчик с английского".
Метод main менять нельзя!
 */
public class Solution_12 {
    public void javaRush()  {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public  static class Translator {
        public String translate() {
            return "Я переводчик с английского";
        }
    }

}