package TasksJavaRush.Course_18.Solution_19;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв).
Закрыть потоки.
*/
public class Solution_16 {

    public static void javaRush(String[] args) throws Exception {
        FileInputStream file = new FileInputStream(args[0]);
        BufferedReader reader = new BufferedReader(new InputStreamReader(file));
        int count = 0;
        int i;
        while ((i = reader.read()) != -1) {
            if (i >= 'A' && i <= 'Z' || i >= 'a' && i <= 'z')
                count++;
        }
        System.out.println(count);
        file.close();
        reader.close();
    }
}
