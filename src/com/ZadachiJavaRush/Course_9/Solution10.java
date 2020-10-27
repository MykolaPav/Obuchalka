package com.ZadachiJavaRush.Course_9;

import java.io.IOException;
import java.util.ArrayList;

/*
Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);
 */
public class Solution10 {
    public void javaRush() throws IOException {
        try {

            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}
