package com.ZadachiJavaRush.Course_8;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
Есть коллекция Map<String, String> (реализация HashMap), туда занесли 10 различных строк.
Вывести на экран список ключей, каждый элемент с новой строки.
 */
public class Solution4 {
    public void javaRush() throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        for (var x : map.entrySet()) {
            String key = x.getKey();
            System.out.println(key);
        }
    }
}
