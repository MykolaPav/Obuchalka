package com.ZadachiJavaRush.Course_9;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat
 */
public class Solution22 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(sc.nextLine());
        } catch (ParseException e) {
            //e.printStackTrace();
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        System.out.println(dateFormat.format(date).toUpperCase());
    }
}
