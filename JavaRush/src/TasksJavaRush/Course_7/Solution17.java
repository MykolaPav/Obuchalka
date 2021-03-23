package TasksJavaRush.Course_7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу:
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
3. Выведи результат на экран, каждое значение с новой строки.
 */
public class Solution17 {
    public void javaRush() throws IOException {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextLine());
        }
        ArrayList<String> result = doubleValues(list);
    }
    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ) {
                list.add(i, list.get(i));   //метод удваевает слово и перескакивает на два индекса,
                i += 2;                    //так как новое слово добавилось в следующую от проверяемой
        }
        for (int i = 0; i < list.size(); i++) {  //вывод списка на консоль
            System.out.println(list.get(i));
        }
        return list;
    }
}
