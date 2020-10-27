package com.CodeWars.BeginnerSeriesClock_8Kyu;

import java.time.Duration;

/**
 * Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
 *
 * Your task is to make 'Past' function which returns time converted to milliseconds.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(Past(0, 2, 5));
    }

    public static int Past(int h, int m, int s)
    {
        //Happy Coding! ^_^
       // return h * 3600000 + m * 60000 + s * 1000;
        return (int) Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
    }
}
