package com.ZadachiJavaRush.Course_8;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/*
Создать коллекцию Set (реализация HashSet) с типом элементов String.
Добавить в неё 10 строк:
арбуз    ежевика
банан    женьшень
вишня    земляника
груша    ирис
дыня     картофель
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
 */
public class Solution1 {
    public void javaRush() throws IOException {
        Set<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        for (String i : set)
            System.out.println(i);
    }
}
