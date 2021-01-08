package com.TasksJavaRush.Course_3;
/*
public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546)); }
public static int sumDigitsInNumber(int number) {
        String s = ""+number;          //преобразуем число в строку
        char a[]=s.toCharArray();      //разбиваем строку на отдельные символы типа char каждый из которых засовываем в массив a[ ] -> a[0]="5", a[1]=4; a[2]=6;
        int ret=0;                     //объявляем переменную возврата и даем ей значение 0
        int len=a.length;              //вычисляем длину массива (количество рязрядов в нашем числе) и загоняем его в новую переменную len
        for (int i=0; i<len; i++) {    //запускаем цикл количество оборотов которого равно длине массива данный цикл должен по очереди перебрать каждую ячейку массива а
        int t=(int)a[i]-48;            //преобразуем символ числа типа char содержащегося в каждой из ячеек массива в число типа int и загоняем его значение в переменную t
        ret=ret+t;                     //увеличиваем переменную возврата на t
       }
        return ret;                    //завершаем работу метода возвращая финальное значение t
        }
Напиши код метода sumDigitsInNumber(int number).
Метод на вход принимает целое трехзначное число.
Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
Пример:
Метод sumDigitsInNumber вызывается с параметром 546.
Пример вывода:
15
 */
public class Solution24 {
    public void javaRush() {
        System.out.println(sumDigitsInNumber(546));
    }
    public int sumDigitsInNumber(int number) {
//        Первый вариант
//        int a, b, sum = 0;
//        a = number % 10;      // 546 % 10 = 6 (остаток от деления)
//        b = number / 10;        // 546 / 10 = 54 (не 54.6 потому что int округляет до целого)
//        sum = sum + a;          // 0 + 6 = 6
//        a = b % 10;                 // 54 % 10 = 4
//        b = b / 10;                   // 54 / 10 = 5
//        sum = sum + a + b;    // 4 + 6 + 5 = 15
//        return sum;

//        Второй вариант
//        int a = number / 100;
//        int b = number / 10 % 10;
//        int c = number % 10;
//        int x = a + b + c;
//        return x;

//        Третий вариант
//        int a = number / 100;
//        int b = number / 10 % 10;
//        int c = number % 10;
//        return a + b + c;

//        Четвёртый вариант
        return (number / 100) + (number % 10) + ((number % 100) / 10);


    }
}
