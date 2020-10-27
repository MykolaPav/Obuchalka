package com.ZadachiJavaRush.Course_5;
import java.io.IOException;

/*
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
 */
public class Solution27 {
    public void javaRush() throws IOException {
        Man man1 = new Man("Bob", 19, "Kyiv");
        Man man2 = new Man("Toni", 25, "Prague");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);

        Woman woman1 = new Woman("Liza", 22, "London");
        Woman woman2 = new Woman("Tonya", 21, "Paris");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }
    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}

//
//public class Solution {
//    public static void main(String[] args) {
//        Man man1 = new Man("AAA",25,"BBB");
//        Man man2 = new Man("SSS",25,"CCC");
//        System.out.println(man1.name+" "+man1.age+" "+man1.address);
//        System.out.println(man2.name+" "+man2.age+" "+man2.address);
//        Woman woman1 = new Woman("DDD",25,"FFF");
//        Woman woman2 = new Woman("XXX",25,"LLL");
//        System.out.println(woman1.name+" "+woman1.age+" "+woman1.address);
//        System.out.println(woman2.name+" "+woman2.age+" "+woman2.address);
//    }
//
//    public static class Man {
//        String name;
//        int age;
//        String address;
//        public Man(String name, int age, String address) {
//            this.name = name;
//            this.age = age;
//            this.address = address;
//        }}
//    public static class Woman {
//        String name;
//        int age;
//        String address;
//        public Woman(String name, int age, String address) {
//            this.name = name;
//            this.age = age;
//            this.address = address;
//        }}
//}
