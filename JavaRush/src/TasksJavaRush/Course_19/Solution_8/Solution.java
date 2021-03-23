package TasksJavaRush.Course_19.Solution_8;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *Считать с консоли 2 имени файла.
 * Вывести во второй файл все числа, которые есть в первом файле.
 * Числа выводить через пробел.
 * Закрыть потоки.
 *
 * Пример тела файла:
 * 12 text var2 14 8ю 1
 *
 * Результат:
 * 12 14 1
 *     "C:\Users\CMDR_\OneDrive\Рабочий стол\Test\File2.txt"
 */
public class Solution {
    public  void javaRush() throws IOException {
        String data;
        Pattern word = Pattern.compile("\\b\\d+\\b");
        Matcher matcher;
        BufferedReader readPath = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = readPath.readLine();
        String fileName2 = readPath.readLine();
        readPath.close();

        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
        while (reader.ready()){
            data = reader.readLine();
            matcher = word.matcher(data);
            while (matcher.find()){
                writer.write(matcher.group() + " ");
            }
        }
        reader.close();
        writer.close();
    }
}
