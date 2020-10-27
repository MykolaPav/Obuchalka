package com.CodeWars.NonСonsecutiveNumber_8Kyu;

/**
 * Find the first non-consecutive number
 * Нужно найти первое на последовательное число в массиве.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        System.out.println(find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println(find(new int[]{4, 6, 7, 8, 9, 11}));
        System.out.println(find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        System.out.println(find(new int[]{31, 32}));
        System.out.println(find(new int[]{-3, -2, 0, 1}));
        System.out.println(find(new int[]{-5, -4, -3, -1}));
    }

    static Integer find(final int[] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] - 1 != array[i - 1])
            {
                return array[i];
            }
        }
        return null;
    }
}
