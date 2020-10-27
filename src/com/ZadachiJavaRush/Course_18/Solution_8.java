package com.ZadachiJavaRush.Course_18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/*
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.
*/
public class Solution_8 {
    public static void javaRush() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream fin = new FileInputStream(file1);

        FileOutputStream fot1 = new FileOutputStream(file2);
        FileOutputStream fot2 = new FileOutputStream(file3);
        byte[] buffer = new byte[fin.available()];
        while (fin.available() > 0) {
            int count = fin.read(buffer);
            if (buffer.length % 2 != 0) {
                fot1.write(buffer, 0, count / 2 + 1);
                fot2.write(buffer, buffer.length / 2 + 1, count / 2);
            }else {
                fot1.write(buffer, 0, count / 2);
                fot2.write(buffer, buffer.length / 2, count / 2);
            }
        }
        reader.close();
        fin.close();
        fot1.close();
    }
}
