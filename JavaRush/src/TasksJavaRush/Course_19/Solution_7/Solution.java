package TasksJavaRush.Course_19.Solution_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * Считать с консоли имя файла.
 * Файл содержит слова, разделенные знаками препинания.
 * Вывести в консоль количество слов "world", которые встречаются в файле.
 * Закрыть потоки.
 */
public class Solution {
    //"C:\Users\CMDR_\OneDrive\Рабочий стол\Test\World.txt"
    public void javaRush() throws Exception {
        int count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readerFromFile = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(readerFromFile);
        BufferedReader reader2 = new BufferedReader(fileReader);
        while (reader2.ready()) {
            String data = reader2.readLine();
            String[] arr = data.split("\\W");
            for (String element : arr) {
                if (element.equals("world")) count ++; }
        }
            fileReader.close();
            reader2.close();
        System.out.println(count);
    }
}
