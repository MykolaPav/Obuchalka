package com.ZadachiJavaRush.Course_18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/*
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла,
а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.
*/
public class Solution_18 {
//"C:\Users\CMDR_\OneDrive\Рабочий стол\Test\File1.txt"
//"C:\Users\CMDR_\OneDrive\Рабочий стол\Test\File2.txt"
//"C:\Users\CMDR_\OneDrive\Рабочий стол\Test\File3.txt"
    public static void javaRush() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        reader.close();

        FileInputStream fin1 = new FileInputStream(file2);
        FileInputStream fin2 = new FileInputStream(file3);
        FileOutputStream fout = new FileOutputStream(file1);

        int x;
        while ((x = fin1.read()) != -1) {
            fout.write(x);
        }
        fout.close();

        fout = new FileOutputStream(file1, true);
        int y;
        while ((y = fin2.read()) != -1){
            fout.write(y);
        }
        fin1.close();
        fin2.close();
        fout.close();
    }
}
