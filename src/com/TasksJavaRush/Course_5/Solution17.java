package com.TasksJavaRush.Course_5;
import java.io.IOException;

/*
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
 */
public class Solution17 {
    public void javaRush() throws IOException {
        //
    }
    public class Friend{
        String name;
        int age;
        char sex;

        public Friend(String name) {
            this.name = name;
        }

        public Friend(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Friend(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }
}
