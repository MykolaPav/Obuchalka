package com.TasksJavaRush.Course_12;
/*
Переопредели метод getName в классе Cat так, чтобы программа выдавала на экран надпись "Я - кот"
 */
public class Solution_21 {
    public void javaRush()  {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "Я - пушистик";
        }
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "Я - кот";
        }
    }
}
