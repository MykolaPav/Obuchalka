package TasksJavaRush.Course_9;

import java.io.IOException;

/*
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
 */
public class Solution8 {
    public void javaRush() throws IOException {
        try {

            String s = null;
            String m = s.toLowerCase();

        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
