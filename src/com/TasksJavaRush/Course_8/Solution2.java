package com.TasksJavaRush.Course_8;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
арбуз - ягода,   ежевика - куст,
банан - трава,   жень-шень - корень,
вишня - ягода,   земляника - ягода,
груша - фрукт,   ирис - цветок,
дыня - овощ,     картофель - клубень.

Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
картофель - клубень
 */
public class Solution2 {
    public void javaRush() throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("арбуз","ягода");
        map.put("банан","трава");
        map.put("вишня","ягода");
        map.put("груша","фрукт");
        map.put("дыня","овощ");
        map.put("ежевика","куст");
        map.put("жень-шень","корень");
        map.put("земляника","ягода");
        map.put("ирис","цветок");
        map.put("картофель","клубень");
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
