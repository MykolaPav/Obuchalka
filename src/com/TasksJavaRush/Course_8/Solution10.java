package com.TasksJavaRush.Course_8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getGetTimeInMs должен вернуть время своего исполнения в миллисекундах.
 */
public class Solution10 {
    public void javaRush() throws IOException {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }
    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        long listTime = System.currentTimeMillis();

        get10000(list);

        long resultTime = System.currentTimeMillis() - listTime;
        return resultTime;

    }

    public static void get10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
