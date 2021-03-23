package TasksJavaRush.Course_18.Solution_7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
С консоли считать имя файла.
Посчитать в файле количество символов ',', количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ','.
*/
public class Solution_7 {
    //"C:\Users\CMDR_\OneDrive\Рабочий стол\Test\File.txt"
    public static void javaRush() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        FileInputStream fin = new FileInputStream(file);
        while (fin.available() > 0) {
            list.add(fin.read());
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(44)) {
                count++;
            }
        }
        System.out.println(count);
        reader.close();
        fin.close();
    }
}
