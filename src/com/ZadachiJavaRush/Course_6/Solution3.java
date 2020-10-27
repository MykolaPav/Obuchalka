package com.ZadachiJavaRush.Course_6;
import java.io.IOException;

/*
Создать в цикле по 50 000 объектов Cat и Dog.
(Java-машина должна начать уничтожать неиспользуемые,
и метод finalize хоть раз да вызовется).
 */
public class Solution3 {
    public void javaRush() throws IOException {
        for (int i = 0; i < 50000; i++) {
            Dog dog = new Dog();
            Cat1 cat = new Cat1();
        }
    }
}
//class Cat {
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//        System.out.println("A Cat was destroyed");
//    }
//}
//
//class Dog {
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//        System.out.println("A Dog was destroyed");
//    }
//}

