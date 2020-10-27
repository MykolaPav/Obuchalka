package com.ZadachiJavaRush.Course_9;

import java.io.IOException;
import java.util.HashMap;

/*
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
HashMap map = new HashMap(null);
map.put(null, null);
map.remove(null);
 */
public class Solution11 {
    public void javaRush() throws IOException {
        try {

            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);

        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
