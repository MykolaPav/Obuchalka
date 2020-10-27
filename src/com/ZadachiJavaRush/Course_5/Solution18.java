package com.ZadachiJavaRush.Course_5;
import java.io.IOException;

/*
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)
Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
 */
public class Solution18 {
    public void javaRush() throws IOException {
        //
    }
    public class Cat{
        String name;
        int weight;
        int age;
        String colour;
        String address;

        public Cat(String name) {
            this.name = name;
            this.weight = 1;
            this.age = 2;
            this.colour = "colour";
        }

        public Cat(String name, int weight, int age) {
            this.name = name;
            this.weight = weight;
            this.age = age;
            this.colour = "colour";
        }

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
            this.weight = 3;
            this.colour = "colour";
        }

        public Cat(int weight, String colour) {
            this.weight = weight;
            this.colour = colour;
            this.age = 1;
        }

        public Cat(int weight, String colour, String address) {
            this.weight = weight;
            this.colour = colour;
            this.address = address;
            this.age = 1;
        }
    }
}
