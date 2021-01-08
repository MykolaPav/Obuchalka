package com.TasksJavaRush.Course_9;

import java.io.IOException;
import java.util.*;

/*
Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.
 */
public class Solution27 {
    public void javaRush() throws IOException {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<>();
        map.put("Tom1", new Cat("Tom1"));
        map.put("Tom2", new Cat("Tom2"));
        map.put("Tom3", new Cat("Tom3"));
        map.put("Tom4", new Cat("Tom4"));
        map.put("Tom5", new Cat("Tom5"));
        map.put("Tom6", new Cat("Tom6"));
        map.put("Tom7", new Cat("Tom7"));
        map.put("Tom8", new Cat("Tom8"));
        map.put("Tom9", new Cat("Tom9"));
        map.put("Tom10", new Cat("Tom10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>(map.values());
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
