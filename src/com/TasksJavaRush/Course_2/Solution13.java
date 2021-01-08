package com.TasksJavaRush.Course_2;
/*
реализуй метод getWeight(int), который принимает вес тела (в Ньютонах) на Земле,
и возвращает, сколько это тело будет весить на Луне (в Ньютонах).
Тип возвращаемого значения - double.

Пример:
Метод getWeight вызывается с параметром 888.
public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double m = earthWeight * 0.17;
        return m;
    }
}
 */
public class Solution13 {
    public void javaRush(){
        System.out.println(getWeight(888));
    }
    public double getWeight(int earthWeight){
        double m = earthWeight * 0.17;
        return m;
    }
}
