package TasksJavaRush.Course_4;

import java.io.IOException;
import java.util.Scanner;

/*
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.
 */
public class Solution21 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        if (a.equals(b))
            System.out.println("Имена идентичны");
        else if (a.length() == b.length())
            System.out.println("Длины имен равны");


//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String a = reader.readLine();
//        String b = reader.readLine();

//        if (a.equals(b))
//            System.out.println("Имена идентичны");
//        else if (a.length() == b.length())
//            System.out.print("Длины имен равны");
    }
}
