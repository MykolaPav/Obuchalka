package TasksJavaRush.Course_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры число n.
Вывести на экран надпись "Я буду зарабатывать $n в час".
Пример:
Я буду зарабатывать $50 в час
 */
public class Solution26 {
    public void javaRush() throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Я буду зарабатывать $" + b.readLine() + " в час");
    }
}
