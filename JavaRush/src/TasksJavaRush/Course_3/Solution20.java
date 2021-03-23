package TasksJavaRush.Course_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!
Пример:
Тимур зарабатывает $5,000. Ха-ха-ха!
 */
public class Solution20 {
    public void javaRush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
