package TasksJavaRush.Course_19.Solution_10;

import java.io.*;

/**
 * Считать с консоли 2 имени файла.
 * Первый Файл содержит текст.
 * Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой строки.
 *
 * Результат вывести во второй файл.
 *
 * Закрыть потоки.
 * "C:\Users\CMDR_\OneDrive\Рабочий стол\Test\File1.txt"
 */
public class Solution {
    public void javaRush() throws IOException {
        BufferedReader readPath = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = readPath.readLine();
        String fileName2 = readPath.readLine();
        readPath.close();

        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
        while (reader.ready()){
            writer.write(reader.readLine().replaceAll("\\pP", ""));
        }
        //
        reader.close();
        writer.close();
    }
}
