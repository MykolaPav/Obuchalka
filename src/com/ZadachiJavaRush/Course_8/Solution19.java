package com.ZadachiJavaRush.Course_8;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.
 */
public class Solution19 {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Павлен", 1000);
        map.put("Павленк", 450);
        map.put("Павленко", 800);
        map.put("Иванцив", 250);
        map.put("Бердышева", 600);
        map.put("Бердыше", 2000);
        map.put("Бердышев", 100);
        map.put("Хорова", 500);
        map.put("Хоро", 500);
        map.put("Хоров", 600);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> x : copy.entrySet()) {
            if(x.getValue() < 500)
                map.remove(x.getKey());
        }
    }
    public void javaRush() throws IOException {

    }
}
