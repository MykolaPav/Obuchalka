package com.ZadachiJavaRush.Course_4;
/*
Написать код, чтобы правильно считалось количество созданных котов (count)
и на экран выдавалось правильное их количество.
 */
public class Solution7 {
    public void javaRush() {
        Cat cat1 = new Cat();
        Cat.count++;

        Cat cat2 = new Cat();
        Cat.count++;

        Cat cat3 = new Cat();
        Cat.count++;

        System.out.println("The cat count is " + Cat.count);
    }
    public static class Cat {
        public static int count = 0;
    }
}
//public class Solution7 {
//    public void javaRush() {
//        Cat cat1 = new Cat();
//        Cat cat2 = new Cat();
//        Cat cat3 = new Cat();
//        Cat cat4 = new Cat();
//        Cat cat5 = new Cat();
//        Cat cat6 = new Cat();
//        Cat cat7 = new Cat();
//        Cat cat8 = new Cat();
//        Cat cat9 = new Cat();
//        Cat cat10 = new Cat();
//
//        // Выведи значение переменной catCount
//        System.out.println(Cat.catCount);
//    }
//
//    public static class Cat {
//        public static int catCount = 0;
//
//        // Создай конструктор
//        public Cat() {
//            Cat.catCount++;
//        }
//    }
//}
