package com.CodeWars.StringRepeat_8Kyu;

/**
 * Write a function called repeat_str which repeats the given string src exactly count times.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(repeatStr(3, "Hello"));
        System.out.println(repeatStr(5, ""));
        System.out.println(repeatStr(0, "kata"));
        System.out.println(repeatStr(4, "a"));
    }

    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}
