package com.TasksJavaRush.Course_13;

import java.io.*;

/*
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
 */
public class Solution_18 {
    public void javaRush() throws Throwable {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = null;

        try {
            sourceFileName = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream file = null;
        int readFromFile = 0;

        try {
            file = new FileInputStream(sourceFileName);
            while ((readFromFile = file.read()) != -1) {
            System.out.print((char) readFromFile);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
