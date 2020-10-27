package com.ZadachiJavaRush.Course_18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/*
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так,
чтобы получилось объединение файлов.
Закрыть потоки.
*/
public class Solution_19 {

    public static void javaRush() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileInputStream file1 = new FileInputStream(fileName1);
        FileInputStream file2 = new FileInputStream(fileName2);

        int x;
        while ((x = file1.read()) != -1) {

        }

        int y;
        while ((y = file2.read()) != -1){

        }
        FileOutputStream fileOut = new FileOutputStream(fileName1);
        fileOut.write(x);
        fileOut.write(y);
        file1.close();
        file2.close();
        fileOut.close();
    }
}
