package com.TasksJavaRush.Course_8;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/*
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
 */
public class Solution15 {

    public static Set<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i < 20; i++) {
            set.add(i);
        }

        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {

        set.removeIf(integer -> integer > 10);
        return    set;

    }

    public void javaRush() throws IOException {

    }
}
