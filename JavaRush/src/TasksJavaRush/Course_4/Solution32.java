package TasksJavaRush.Course_4;
import java.io.IOException;
import java.util.Scanner;

/*
Ввести с клавиатуры строку и число N больше 0.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
Пример ввода:
абв
2
Пример вывода:
абв
абв
 */
public class Solution32 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        int c = 1;
        while (c<=b) {
            System.out.println(a);
            c++;
        }
    }
}
