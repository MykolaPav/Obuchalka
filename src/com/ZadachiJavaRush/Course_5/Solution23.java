package com.ZadachiJavaRush.Course_5;
import java.io.IOException;

/*
Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.
Подсказка:
не забудь про конструктор по умолчанию.
 */
public class Solution23 {
    public void javaRush() throws IOException {
        //
    }
    public class Circle {
        public double x;
        public double y;
        public double radius;

        public Circle() {
        }

        public Circle(double x) {
            this.x = x;
        }

        public Circle(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Circle(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }
    }
}


//
//public class Circle {
//    public double x;
//    public double y;
//    public double radius;
//
//    public Circle () {
//        radius = 10;
//    }
//    public Circle(double x){
//        this.x = x;
//    }
//    public Circle(double x, double y){
//        this.x = x;
//        this.y = y;
//    }
//    public Circle(double x, double y, double radius){
//        this.x = x;
//        this.y = y;
//        this.radius = radius;
//    }
//    public Circle(Circle circle){
//        this.x = circle.x;
//        this.y = circle.y;
//        this.radius = circle.radius;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}