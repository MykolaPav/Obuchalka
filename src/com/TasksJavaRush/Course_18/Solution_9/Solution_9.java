package com.TasksJavaRush.Course_18.Solution_9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/*
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.
*/
public class Solution_9 {

    public static void javaRush() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream fin = new FileInputStream(file1);
        FileOutputStream fot = new FileOutputStream(file2);

        while (fin.available() > 0) {
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer);
            for (int i = buffer.length-1; i >= 0; i--) {
                fot.write(buffer[i]);
            }
        }
        reader.close();
        fin.close();
        fot.close();
    }
}
