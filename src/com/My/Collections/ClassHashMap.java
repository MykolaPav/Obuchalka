package com.My.Collections;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ClassHashMap {
    /*
    Есть класс Cat с полем имя (name, String).
    Создать коллекцию Map<String, Cat> (реализация HashMap).
    Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
    Вывести результат на экран, каждый элемент с новой строки.
     */
    public void javaRush() throws IOException {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый",
                "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static Map<String, Cat> addCatsToMap(String[] cats) {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        for (int i = 0; i < cats.length; i++) {

            Cat cat = new Cat(cats[i]);
            map.put(cats[i], cat);
        }
        return map;
    }

    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
