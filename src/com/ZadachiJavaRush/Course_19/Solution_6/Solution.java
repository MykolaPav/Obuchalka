package com.ZadachiJavaRush.Course_19.Solution_6;

import java.io.*;
import java.util.ArrayList;

/**
 *Считать с консоли 2 имени файла.
 * Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).
 *
 * Пример первого файла:
 * text in file
 * Вывод во втором файле:
 * eti ie
 * Закрыть потоки ввода-вывод
 */
public class Solution {

    public static void javaRush() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          String reader1= reader.readLine();
          String reader2= reader.readLine();
            reader.close();
          FileReader fileReader = new FileReader(reader1);
          FileWriter fileWriter = new FileWriter(reader2);
        while (fileReader.ready()) {
                 int data = fileReader.read();
                 list.add(data);
        }
        for (int i = 1; i < list.size(); i+=2) {
            fileWriter.write(list.get(i));
        }
        fileReader.close();
        fileWriter.close();
    }
}
