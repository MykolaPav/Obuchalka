package com.ZadachiJavaRush.Course_10;

/*
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
 */
public class Solution13 {
    public void javaRush() {
    }

        public static class Human {
            private String name;
            private String sex;
            private String nationality;
            private int age;
            private int weight;
            private int height;

            public Human(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public Human(String name, String sex) {
                this.name = name;
                this.sex = sex;
            }

            public Human(String name, String sex, int age) {
                this.name = name;
                this.sex = sex;
                this.age = age;
            }

            public Human(String name, int weight, int height) {
                this.name = name;
                this.weight = weight;
                this.height = height;
            }

            public Human(String name, String sex, String nationality) {
                this.name = name;
                this.sex = sex;
                this.nationality = nationality;
            }

            public Human(String name, String sex, String nationality, int age) {
                this.name = name;
                this.sex = sex;
                this.nationality = nationality;
                this.age = age;
            }

            public Human(String name, String nationality, int age, int weight) {
                this.name = name;
                this.nationality = nationality;
                this.age = age;
                this.weight = weight;
            }

            public Human(String name, String sex, String nationality, int age, int weight) {
                this.name = name;
                this.sex = sex;
                this.nationality = nationality;
                this.age = age;
                this.weight = weight;
            }

            public Human(String name, String sex, int age, int weight, int height) {
                this.name = name;
                this.sex = sex;
                this.age = age;
                this.weight = weight;
                this.height = height;
            }



            public Human(String name, String sex, String nationality, int age, int weight, int height) {
                this.name = name;
                this.sex = sex;
                this.nationality = nationality;
                this.age = age;
                this.weight = weight;
                this.height = height;
            }
        }
}
