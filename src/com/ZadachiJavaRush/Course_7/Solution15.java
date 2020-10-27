package com.ZadachiJavaRush.Course_7;

import java.io.IOException;
import java.util.ArrayList;

/*
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.
 */
public class Solution15 {
    public void javaRush() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        list.add(1, "именно");
        list.add(3, "именно");
        list.add(5, "именно");
        for (String x : list)
        System.out.println(x);
    }

}
