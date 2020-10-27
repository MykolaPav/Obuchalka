package com.CodeWars.Area_or_Perimeter_8Kyu;

/**
 * You are given the length and width of a 4-sided polygon.
 * The polygon can either be a rectangle or a square.
 * If it is a square, return its area. If it is a rectangle, return its perimeter.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(5, 5));
        System.out.println(areaOrPerimeter(7, 5));
        System.out.println(areaOrPerimeter(8, 5));
    }

    public static int areaOrPerimeter (int l, int w)
    {
        // code away...
        return l == w? l * w : (l + w) * 2;
    }
}
