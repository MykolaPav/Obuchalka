package TasksJavaRush.Course_5;
import java.io.IOException;
import java.util.Scanner;

/*
Задача: Программа считывает два числа с клавиатуры и выводит их сумму на экран.
 */
public class Solution31 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = a + b;

        System.out.println("Sum = " + count);
    }
}


//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String a = reader.readLine();
//        String b = reader.readLine();
//
//        int z = Integer.parseInt(a);
//        int x = Integer.parseInt(b);
//
//        int sum = z + x;
//        System.out.println("Sum = " + sum);
//    }
//}
