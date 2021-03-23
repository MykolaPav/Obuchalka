package TasksJavaRush.Course_7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
 */
public class Solution10 {
    public void javaRush() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(0, sc.nextLine());
        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(list.get(i));
//        }
        for (int i = list.size()-1; i >=0; i--)
             System.out.println( list.get(i));
    }
}
