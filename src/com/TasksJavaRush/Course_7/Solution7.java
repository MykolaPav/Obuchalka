package com.TasksJavaRush.Course_7;

import java.io.IOException;
import java.util.ArrayList;

/*
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
 */
public class Solution7 {
    public void javaRush() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add( " Мама ");
        list.add(" Мыла ");
        list.add(" Раму ");
        list.add(" Папе ");
        list.add( " Дома ");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

}
