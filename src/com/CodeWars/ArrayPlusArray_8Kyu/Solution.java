package com.CodeWars.ArrayPlusArray_8Kyu;

/**
 * I'm new to coding and now I want to get the sum of two arrays...
 * actually the sum of all their elements. I'll appreciate for your help.
 *
 * P.S. Each array includes only integer numbers. Output is a number too.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        System.out.println(arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        System.out.println(arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
        System.out.println(arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        int count = 0;
        for (int i = 0; i < arr1.length; i++)
        {
            count += arr1[i] + arr2[i];
        }
        return count;
    }
}
