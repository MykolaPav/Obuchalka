package com.ZadachiJavaRush.Course_5;
import java.io.IOException;
import java.util.Scanner;

/*
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.
Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка, например "exit",
можно с помощью следующей конструкции:
while (true)
{
	String s = buffer.readLine();
	if (s.equals("exit"))
		break;
}
 */
public class Solution30 {
    public void javaRush() throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int sum = 0;
//        while (true) {
//            String s = reader.readLine();
//            if (s.equals("сумма"))
//                break;
//            int number = Integer.parseInt(s);
//            sum += number;
//
//        }
//        System.out.println(sum);


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while (true) {
            String exit = sc.nextLine();
            if (exit.equals("exit")) break;
            count += num;
        }

        System.out.println(count);
    }
}

