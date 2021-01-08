package com.TasksJavaRush.Course_6;

import java.io.IOException;

/*
В каждом классе Cat и Dog написать метод finalize,
который выводит на экран текст о том, что такой-то объект уничтожен.
 */
public class Solution2 {
    public void javaRush() throws IOException {
    }
}
class Cat1 {
    protected void finalize() throws Throwable {
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    protected void finalize() throws Throwable {
        System.out.println("A Dog was destroyed");
    }
}


//
//public class Cat {
//    public static void main(String[] args) {
//    }
//    protected void finalize()throws Throwable {
//        System.out.println("A Cat was destroyed");
//    }
//}
//class Dog {
//    protected void finalize()throws Throwable {
//        System.out.println("A Dog was destroyed");
//    }
//}