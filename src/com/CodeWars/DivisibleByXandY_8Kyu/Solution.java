package com.CodeWars.DivisibleByXandY_8Kyu;

/**
 * Is n divisible by x and y?
 * Делится ли N на X и Y?
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(isDivisible(10, 2, 5));
        System.out.println(isDivisible(100, 2, 5));
        System.out.println(isDivisible(7, 2, 5));
    }
    public static boolean isDivisible(long n, long x, long y) {
        return n %x == 0 && n %y == 0;
    }
}
