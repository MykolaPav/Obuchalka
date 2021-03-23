package TasksJavaRush.Course_18.Solution_1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
 * Ввести с консоли имя файла.
 * Найти максимальный байт в файле, вывести его на экран.
 * Закрыть поток ввода-вывода.
 */
public class Solution_1 {

    public void javaRush() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        long max = -1;
        FileInputStream fin = new FileInputStream(file);
        while (fin.available() > 0) {
            //fin.read();
            max = Math.max(max, fin.read());
        }
        reader.close();
        fin.close();
        System.out.println(max);
    }
}
