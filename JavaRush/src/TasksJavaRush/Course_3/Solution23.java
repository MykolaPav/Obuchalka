package TasksJavaRush.Course_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример:
Вася + Ева + Анжелика = Чистая любовь, да-да!
 */
public class Solution23 {
    public void javaRush()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String name1 = reader.readLine();
//        String name2 = reader.readLine();
//        String name3 = reader.readLine();
//
//        System.out.println(name1 + " + " + name2 + " + " + name3 + " + " +" = Чистая любовь, да-да!");

        System.out.println(reader.readLine() + " + " + reader.readLine() + " + " + reader.readLine() + " = Чистая любовь, да-да!");

    }

}
