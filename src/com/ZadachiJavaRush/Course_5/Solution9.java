package com.ZadachiJavaRush.Course_5;
import java.io.IOException;

/*
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
Примечание:
Имя(String), возраст(int), пол(char).
 */
public class Solution9 {
    public void javaRush() throws IOException {
        //
    }
    public class Friend {
        String name;
        int age;
        char sex;
        public void initialize (String name) {
            this.name = name;
        }
        public void initialize (String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void initialize (String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

    }
}
