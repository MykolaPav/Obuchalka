package com.CodeWars.Grasshopper_DebugSayHello_8Kyu;

/**
 * The starship Enterprise has run into some problem when creating a program to greet everyone
 * as they come aboard. It is your job to fix the code and get the program working again!
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(sayHello("Mr. Spock"));
        System.out.println(sayHello("Captain Kirk"));
        System.out.println(sayHello("Liutenant Uhura"));
        System.out.println(sayHello("Dr. McCoy"));
    }

    public static String sayHello(String name) {

        return "Hello, " + name;
    }
}
