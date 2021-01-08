package com.TasksJavaRush.Course_8;

import java.io.IOException;
import java.time.ZoneId;

/*

 */
public class Solution13 {
    public void javaRush() throws IOException {
//        int sec = 1;
//        int min = sec * 60;
//        int hour = min * 60;
//        int day = hour * 24;
//        int wek = day * 7;
//        int man = day * 30;
//        int yar = day * 365;
//        System.out.println("В минуте " + min + " секунд");
//        System.out.println("В часе " + hour + " секунд");
//        System.out.println("В дне " + day + " секунд");
//        System.out.println("В неделе " + wek + " секунд");
//        System.out.println("В месяце " + man + " секунд");
//        System.out.println("В году " + yar + " секунд");

        for (String s: ZoneId.getAvailableZoneIds())
            System.out.println(s);
        boolean a = false;
    }
}
