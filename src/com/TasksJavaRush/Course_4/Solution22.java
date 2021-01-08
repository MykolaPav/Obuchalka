package com.TasksJavaRush.Course_4;

import java.io.IOException;
import java.util.Scanner;

/*
Ввести с клавиатуры имя и возраст.
Если возраст меньше 18 вывести надпись "Подрасти еще".
 */
public class Solution22 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int c = sc.nextInt();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String a = reader.readLine();
//        String  b = reader.readLine();
//        int c = Integer.parseInt(b);

        if (c < 18) {
            System.out.println(a + " Подрасти ещё");
        }
    }
}
