package com.ZadachiJavaRush.Course_11;

/*
Скрыть внутренние переменные класса Cat, к которым есть доступ с помощью методов.
 */
public class Solution7 {
    public void javaRush()  {
        //
    }
    public class Cat {
        private String name;
        private int age;
        public int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
