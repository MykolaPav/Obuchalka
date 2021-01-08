package com.TasksJavaRush.Course_5;
import java.io.IOException;

/*
Изучи внимательно класс Person.
Исправь класс так, чтобы только один метод initialize инициализировал все переменные класса Person.
 */
public class Solution15 {
    public void javaRush() throws IOException {
        //
    }
    public class Person {
        String name;
        char sex;
        int money;
        int weight;
        double size;

        public void initialize(String name, char sex, int money, int weight, double size) {
            this.name = name;
            this.sex = sex;
            this.money = money;
            this.weight = weight;
            this.size = size;
        }
    }
}

//  public class Person {
//     String name;
//     char sex;
//     int money;
//     int weight;
//     double size;

//     public void initialize(String name, char sex, int money, int weight, double size) {
//         this.name = name;
//         this.weight = sex;
//         this.money = money;
//         this.weight = weight;
//         this.size = size;


//     }

//     public static void main(String[] args) {

//     }
// }
