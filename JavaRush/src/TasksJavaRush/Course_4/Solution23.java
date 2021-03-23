package TasksJavaRush.Course_4;

import java.io.IOException;
import java.util.Scanner;

/*
Ввести с клавиатуры имя и возраст.
Если возраст больше 20 вывести надпись "И 18-ти достаточно".
 */
public class Solution23 {
    public void javaRush() throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String a = reader.readLine();
//        String b = reader.readLine();
//        int age = Integer.parseInt(b);

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int age = sc.nextInt();
        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
