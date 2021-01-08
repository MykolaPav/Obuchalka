package com.TasksJavaRush.Course_4;
/*
Напишите метод checkSeason.
По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна
 */
public class Solution11 {
    public void javaRush() {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }
    public static void checkSeason(int month) {
        if (month == 12 || month == 1 || month == 2 ){
            System.out.println("Зима");
        }
        else if (month == 3 || month == 4 || month == 5 ){
            System.out.println("Весна");
        }
        else if (month == 6 || month == 7 || month == 8 ){
            System.out.println("Лето");
        }
        else if (month == 9 || month == 10 || month == 11 ){
            System.out.println("осень");
        }
    }
}
