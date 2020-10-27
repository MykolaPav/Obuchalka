package com.ZadachiJavaRush.Course_4;
import java.util.*;
/*
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".
 */
public class Solution13 {

    public void javaRush() throws Exception{
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String[] s = new String[7];
        s[0] = "Понедельник";
        s[1] = "Вторник";
        s[2] = "Среда";
        s[3] = "Четверг";
        s[4] = "Пятница";
        s[5] = "Суббота";
        s[6] = "Воскресенье";
        if (a == 1)
            System.out.println(s[0]);
        else if(a == 2)
            System.out.println(s[1]);
        else if(a == 3)
            System.out.println(s[2]);
        else if(a == 4)
            System.out.println(s[3]);
        else if(a == 5)
            System.out.println(s[4]);
        else if(a == 6)
            System.out.println(s[5]);
        else if(a == 7)
            System.out.println(s[6]);
        else if(a != s.length)
            System.out.println("такого дня недели не существует");
    }
}
