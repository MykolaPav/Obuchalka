package com.ZadachiJavaRush.Course_4;
import java.util.Scanner;
/*
 // System.out.println(a%5==0||a%5>0&&a<3 ? "зелёный": a%5>=3&&a<4 ? "жёлтый" : a%5>=4 ? "красный");
Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зелёный" - если горит зелёный цвет,
"жёлтый" - если горит жёлтый цвет,
"красный" - если горит красный цвет.
Пример для числа 2.5:
зелёный
Пример для числа 3:
жёлтый
Пример для числа 4:
красный
Пример для числа 5:
зелёный
 */
public class Solution16 {
    public void javaRush() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
//1) Если остаток от деления на 5 равен 0 или ( || ) остаток от деления больше 0 и ( && ) меньше 3, то горит зелёный.
//2) Если остаток от деления на 5 больше, либо равен ( >= ) 3 и меньше 4, то горит  жёлтый.
//3) Если остаток от деления на 5 больше, либо равен 4, то горит красный.
//        if (a % 5 == 0)
//            System.out.println("красный");
//        if (a%5==0 || a%5>0 && a<3){
//            System.out.println("Green");}
//        else if (a%5>=3&&a<4){
//            System.out.println("Yellow");}
//        else if (a%5>=4){
//            System.out.println("Red");}

        if (a % 5 == 0)
            System.out.println("красный");
        else if (a % 5 > 0 & a < 3)
            System.out.println("зелёный");
        else if (a % 5 >= 3 & a < 4)
            System.out.println("жёлтый");
        else if (a % 5 >= 4 & a < 5)
            System.out.println("красный");

//        System.out.println(a%5==0||a%5>0&&a<3 ? "зелёный": a%5>=3&&a<4 ? "жёлтый" : a%5>=4 ? "красный");
    }
}
//    Scanner scanner = new Scanner(System.in);
//    double t = scanner.nextDouble();
//    int a = (int) (t / 5);
//    int e = (int)t;
//
//    int d = e - a * 5;
//        switch (d){
//                case 0:
//
//                case 1:
//                case 5:
//
//                case 2:
//                System.out.println("зелёный");
//                break;
//                case 3:
//                System.out.println("жёлтый");
//                break;
//                case 4:
//                System.out.println("красный");
//                break;


//1) Если остаток от деления на 5 равен 0 или ( || ) остаток от деления больше 0 и ( && ) меньше 3, то горит зелёный.
//2) Если остаток от деления на 5 больше, либо равен ( >= ) 3 и меньше 4, то горит  жёлтый.
//3) Если остаток от деления на 5 больше, либо равен 4, то горит красный.
// Scanner scanner = new Scanner(System.in);
// double a = scanner.nextDouble();
//if (a % 5 == 0)
// System.out.println("красный");
// else if (a%5>0&a<3)
//  System.out.println("зелёный");
// else if (a%5>=3&a<4)
//  System.out.println("жёлтый");
// else if (a%5>=4&a<5)
//  System.out.println("красный");