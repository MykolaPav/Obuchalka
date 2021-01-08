package com.TasksJavaRush.Course_10;

import java.util.ArrayList;
import java.util.Arrays;

/*

 */
public class Solution21 {
    public void javaRush() {
        ArrayList<Integer> listInteger = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listInteger.add(i);
        }
        for (Integer x : listInteger)
            System.out.println(x);

        System.out.println();

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello World!");
        list.add("Hello Kent!");
        System.out.println(list.get(0));
        System.out.println(list.get(1));

            System.out.println();

        for (String x : list)
            System.out.println(x);

            System.out.println();

        ArrayList<String>[] arrayLists = new ArrayList[4];
        arrayLists[0] = new ArrayList(Arrays.asList("Cat1"));
        arrayLists[1] = new ArrayList(Arrays.asList("Cat2"));
        arrayLists[2] = new ArrayList(Arrays.asList("Cat3"));
        arrayLists[3] = new ArrayList(Arrays.asList("Cat4"));
        for (ArrayList<String> listArr : arrayLists) {
            for (String w : listArr) {
                System.out.println(w);
            }
        }
    }
}
