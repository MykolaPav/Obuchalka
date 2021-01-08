package com.TasksJavaRush.Course_5;
import java.io.IOException;

/*
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)
Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касается возраста и цвета.
А вот имени может и не быть (null).
То же касается адреса: null.
 */
public class Solution10 {
    public void javaRush() throws IOException {
        //
    }
    public class Cat {
        String name;
        String colour;
        String address;
        int age;
        int weight;

        public void Cat(String name){
            this.name = "Tom";
        }
        public void initialize(String name, int weight, int age){
            this.name = "Bob";
            this.weight = 5;
            this.age = 4;
        }
        public void initialize(String name, int age){
            this.name = "Vik";
            this.age = 5;
            this.weight = weight;
        }
        public void initialize(int weight, String colour){
            this.weight = 4;
            this.colour = "Black";
            this.name = null;
            this.address = null;
            this.age = 0;
        }
        public void initialize(int weight, String colour, String address){
            this.weight = weight;
            this.colour = colour;
            this.address = "address";
        }


    }
}


//     public class Cat {
//     String name;
//     int  age;
//     int weight;
//     String address;
//     String color;

// public void Cat(String name){
//         this.name = name;
//         this.age = 1;
//         this.weight = 1;
//         this.color = "1";
//     }

//     public Cat(String name, int weight, int age) {
//         this.name = name;
//         this.weight = weight;
//         this.age = age;
//         this.color = "color";
//     }
//     public Cat(String name, int age) {
//         this.name = name;
//         this.age = age;
//         this.weight = 1;
//         this.color = "color9";
//     }
//     public Cat(int weight, String color) {
//         this.weight = weight;
//         this.color = color;
//         this.age = 1;
//     }
//     public Cat(int weight, String color, String address) {
//         this.weight = weight;
//         this.color = color;
//         this.address = address;
//         this.age = 1;
//     }

//     public static void main(String[] args) {

//     }
// }