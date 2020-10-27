package com.ZadachiJavaRush.Course_17.Solution_16;

/*
ApplicationContext будет доступен множеству нитей.
Сделать так, чтобы данные не терялись: подумай, какое ключевое слово необходимо поставить и где.
 */
public class Solution {

    public void javaRush() throws Exception {
        ApplicationContext sol1 = new ApplicationContext() {
            @Override
            protected void parseAllClassesAndInterfaces() {

            }
        };
        sol1.javaR();
    }
}
