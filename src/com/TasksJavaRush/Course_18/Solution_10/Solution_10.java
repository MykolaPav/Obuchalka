package com.TasksJavaRush.Course_18.Solution_10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
   1 Считывать с консоли имена файлов.
   2 Если файл меньше 1000 байт, то:
   2.1 Закрыть потоки работы с файлами.
   2.2 Выбросить исключение DownloadException.
*/
public class Solution_10 {

    public static void javaRush() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        byte[] buffer1 = new byte[1000];

        while (true){
            String file1 = reader.readLine();
            FileInputStream fin = new FileInputStream(file1);
            byte[] buffer2 = new byte[fin.available()];
            if (buffer2.length < buffer1.length){
                throw  new DownloadException();
            }
            reader.close();
            fin.close();
        }

    }
    public static class DownloadException extends Exception {
    }
}
