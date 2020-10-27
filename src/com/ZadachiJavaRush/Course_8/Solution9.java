package com.ZadachiJavaRush.Course_8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getInsertTimeInMs должен вернуть время своего исполнения в миллисекундах
 */
public class Solution9 {
    public void javaRush() throws IOException {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        long listTime = System.currentTimeMillis();

        insert10000(list);

        long resultTime = System.currentTimeMillis() - listTime;
        return resultTime;

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(0, new Object());
        }
    }
}
