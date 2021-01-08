package com.TasksJavaRush.AMain;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {
    List<String> list = new ArrayList<>();


    public void javaRush() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //читаю путь к файлу с консоли
        String file = reader.readLine(); //путь к файлу лежит в переменной
        try (BufferedReader readFile = new BufferedReader( /* читаю содержимое файла с помощью буфера */
                                            new InputStreamReader(
                                                 new FileInputStream(file)))) { /* в поток положил путь (file) к файлу */
            while (readFile.ready()){ /* читаю файл пока есть ещё строки */
                list.add(readFile.readLine()); /* записал содержимое файла в список (list) */
            }
        } catch (Exception e) {

        }
    }
}
