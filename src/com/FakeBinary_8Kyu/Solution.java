package com.FakeBinary_8Kyu;

/**
 *
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }
    public static int[] countPositivesSumNegatives(int[] input) {
        // write your code here
        int count = 0;
        int nCount = 0;
        int[] nums = new int[2];
        nums [0] = count;
        nums[1] = nCount;
        for (Integer x : input)
        {
            if (x > 0) count++;
            if (x < 0) nCount += x;
        }

        return nums;
    }
}
