package TasksJavaRush.Course_18.Solution_4_;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Ввести с консоли имя файла.
Найти байт или байты с минимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.
*/
public class Solution_4 {
   // FileInputStream fis = new FileInputStream("C:\\Users\\CMDR_\\OneDrive\\Рабочий стол\\Коды\\Java\\InputStream OutputStream\\file.txt");
    public static void main(String[] args) throws Exception {
        int[] array = new int[256];
        int minValue = Integer.MAX_VALUE;
        FileInputStream in = new FileInputStream((new BufferedReader(new InputStreamReader(System.in))).readLine());

        while (in.available() > 0) array[in.read()]++;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue && array[i] > 1) minValue = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (minValue == array[i])
                System.out.print(i + " ");
        }

        in.close();
    }
}
