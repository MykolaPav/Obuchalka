package com.TasksJavaRush.Course_8;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
 */
public class Solution16 {
    public static Map<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Павлен", "Николай");
        map.put("Павленк", "Юлия");
        map.put("Павленко", "Нина");
        map.put("Иванцив", "Кристина");
        map.put("Бердышева", "Алёна");
        map.put("Бердыше", "Константин");
        map.put("Бердышев", "Евгений");
        map.put("Хорова", "Александра");
        map.put("Хоро", "Ваня");
        map.put("Хоров", "Александр");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int v=0;
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            if (name.equals(pair.getValue())) {
                v++;}
        }
        return v;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int v=0;
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            if (lastName.equals(pair.getKey())) {
                v++;}
        }
        return v;
    }

    public void javaRush() throws IOException {
        System.out.println(createMap());
    }
}
