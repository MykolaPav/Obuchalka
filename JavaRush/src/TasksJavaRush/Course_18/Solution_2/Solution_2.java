package TasksJavaRush.Course_18.Solution_2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
*  Ввести с консоли имя файла.
*  Найти минимальный байт в файле, вывести его на экран.
*  Закрыть поток ввода-вывода.
*/
public class Solution_2 {

    public void javaRush() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        int min = Integer.MAX_VALUE;
        FileInputStream fin = new FileInputStream(file);
        while (fin.available() > 0) {
            //fin.read();
            min = Math.min(min, fin.read());
        }
        reader.close();
        fin.close();
        System.out.println(min);
    }

}
