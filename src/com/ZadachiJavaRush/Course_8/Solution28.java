package com.ZadachiJavaRush.Course_8;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/*
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
 */
public class Solution28 {
    public void javaRush() throws IOException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Calendar today = Calendar.getInstance();
        today.setTime(new Date(Date.parse(date)));
        return today.get(Calendar.DAY_OF_YEAR) % 2 != 0;
    }
}
