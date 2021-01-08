package com.TasksJavaRush.Course_8;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
 */
public class Solution22 {
    public void javaRush() throws IOException {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }
    public static Map<String, String> createPeopleMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Павлен", "Николай");
        map.put("Павленк", "Юлия");
        map.put("Павленко", "Юлия");
        map.put("Иванцив", "Кристина");
        map.put("Иванцив", "Наталья");
        map.put("Бердышева", "Алёна");
        map.put("Бердыше", "Константин");
        map.put("Бердышев", "Евгений");
        map.put("Хорова", "Александра");
        map.put("Хоров", "Александр");
        return map;
    }
    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
