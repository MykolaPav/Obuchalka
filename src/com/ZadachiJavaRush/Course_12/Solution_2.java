package com.ZadachiJavaRush.Course_12;
/*
Переопределить метод getName в классе Whale(Кит), чтобы программа ничего не выводила на экран.
 */
public class Solution_2 {
    public void javaRush()  {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        @Override
        public String getName() {
            return "";
        }
    }
}
