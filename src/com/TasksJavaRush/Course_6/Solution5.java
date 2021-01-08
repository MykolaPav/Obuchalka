package com.TasksJavaRush.Course_6;
import java.io.IOException;
import java.util.Scanner;

/*
Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.

Пример для числа 4445:
Even: 3 Odd: 1
 */
public class Solution5 {
    public static int even;
    public static int odd;

    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 0;
        while (a>0)  {
            c=a%10;
            a=a/10;
            if (c%2==0) even++;
            if (c%2!=0) odd++;
        }
        System.out.println("Even:" + " " +even+ " "+ "Odd:"+ " "+odd);
    }
}

//public class Solution {
//
//    public static int even;
//    public static int odd;
//
//    public static void main(String[] args) throws IOException {
//        //напишите тут ваш код
//        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(n.readLine());
//        int c;
//        while (a>0)  {
//            c=a%10;
//            a=a/10;
//            if (c%2==0)
//                even++;
//            if (c%2!=0){
//                odd++;}
//        }
//
//        System.out.println("Even:" + " " +even+ " "+ "Odd:"+ " "+odd);
//    }
//}