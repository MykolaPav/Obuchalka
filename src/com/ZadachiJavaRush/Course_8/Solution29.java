package com.ZadachiJavaRush.Course_8;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.
 */
public class Solution29 {
    public void javaRush() throws IOException {
        Map<String, Integer> map = new HashMap();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        for(Map.Entry<String, Integer> pair: map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (x.equals(key))
                System.out.println(x + " is the " + value + " month");
        }
    }
}
