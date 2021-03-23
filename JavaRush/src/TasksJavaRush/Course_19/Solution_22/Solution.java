package TasksJavaRush.Course_19.Solution_22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Считать с консоли имя файла.
 * Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words.
 * Закрыть потоки.
 *
 * Пример:
 * words содержит слова А, Б, В
 *
 * Строки:
 * В Б А Д //3 слова из words, не подходит
 * А Б А Д //3 слова из words, не подходит
 * Д А Д //1 слово из words, не подходит
 * Д А Б Д //2 слова - подходит, выводим
 * Д А А Д //2 слова - подходит, выводим
 */
public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        BufferedReader flr = new BufferedReader(new FileReader(file));

        while (flr.ready()){
            String str = flr.readLine();
            List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
            int count = 0;
            for (String s : words) count += Collections.frequency(list, s);
            if (count == 2) System.out.println(str);
        }
        //
        flr.close();
    }
}
