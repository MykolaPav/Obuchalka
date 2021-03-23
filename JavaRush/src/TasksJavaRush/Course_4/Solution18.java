package TasksJavaRush.Course_4;

import java.util.Scanner;

/*
Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.
 */
public class Solution18 {
    public void javaRush() throws Exception{
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int i = 0;
        if (a < b )
            System.out.println(a);
        else if (a > b)
            System.out.println(b);
        else if (a==b)
            System.out.println(a);
    }
}
