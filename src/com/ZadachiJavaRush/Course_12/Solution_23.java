package com.ZadachiJavaRush.Course_12;
/*
Добавь один метод в класс Cat так, чтобы программа ничего не выводила на экран.
 */
public class Solution_23 {
    public void javaRush()  {
        Pet pet = new Cat();
        pet.setName("Я - пушистик");

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public final String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
        @Override
        public void setName(String name) {
            super.setName("");
        }
    }
}
