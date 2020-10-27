package com.ZadachiJavaRush.Course_5;
import java.io.IOException;

/*
Создать class Person.
У человека должно быть имя String name, возраст int age, пол char sex.
Создайте геттеры и сеттеры для всех переменных класса Person.
 */
public class Solution8 {
    public void javaRush() throws IOException {
        //
    }
    private class Person {
        private String name;
        private int age;
        private char sex;

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

        public char getSex() {
            return sex;
        }

        public void setSex(char sex) {
            this.sex = sex;
        }
    }
}
