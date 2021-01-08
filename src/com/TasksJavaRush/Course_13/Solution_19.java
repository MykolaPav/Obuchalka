package com.TasksJavaRush.Course_13;

import java.io.*;

/*
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
 */
public class Solution_19 {
    public void javaRush() throws IOException {
        String outputFileName = "C:\\Users\\CMDR_\\OneDrive\\Рабочий стол\\Коды\\Java\\newFile.txt";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = null;
        try {
            sourceFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(sourceFileName));
        String line ;
        do {
            line= reader.readLine();
            writer.write(line + "\r\n");
        }while (!(line.equals("exit")));

//        while (true) {
//            String line = reader.readLine();
//            if (line.equals("exit")) {
//                writer.write(line);
//                break;
//            } else {
//                writer.write(line);
//                writer.newLine();
//            }
//        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

