package com.CodeWars.SumOfPositive_8Kyu;

/**
 *
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,3,4,5}));
        System.out.println(sum(new int[]{1,-2,3,4,5}));
        System.out.println(sum(new int[]{}));
        System.out.println(sum(new int[]{-1,-2,-3,-4,-5}));
        System.out.println(sum(new int[]{-1,2,3,4,-5}));
    }

    public static int sum(int[] arr){
        int count = 0;
        for (Integer x : arr)
            if (x > 0) {
                count += x;
            }
        return count;
    }
}
