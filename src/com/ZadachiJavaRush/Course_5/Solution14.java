package com.ZadachiJavaRush.Course_5;
import java.io.IOException;

/*
Создать class Person. У человека должно быть имя String name, возраст int age.
Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
В методе main создай объект Person, занеси его ссылку в переменную person.
Вызови метод initialize с любыми значениями.
 */
public class Solution14 {
    public void javaRush() throws IOException {
        Person person = new Person();
        person.initialize("Tom", 10);
    }
    static class Person{
        String name;
        int age;

        public void initialize(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}





//  public class Solution {
//     public static void main(String[] args) {
//         Person person = new Person();
//         person.initialize("name", 25);
//     }

//     static class Person {
//           public String name;
//           public int age;

// public void initialize(String name, int age) {
//             this.name = name;
//             this.age = age;
//       }
//     }
// }

