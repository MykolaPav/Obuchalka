package com.TasksJavaRush.AMain;

import java.util.LinkedList;
import java.util.List;

public class Solution {
   static KClass k = new KClass();
   static String string = "☺☻♥♦♣♠•◘○";
    static List<Integer> listOfNumbers = new LinkedList<>();
    public static void main(String[] args) {
        k.firstFun();
        System.out.println(string);
//        Integer[] array=new Integer[]{2,4,5,2};
//        System.out.println(printArray(array));

        System.out.println(filterOddNumber(listOfNumbers));
    }

    public static byte sum (byte a, byte b) {
        byte c = (byte) (a + b);
        return  c;
    }

    public static int findAverage(int[] nums) {
        int count = 0;
        for (Integer x : nums)
        {
            count +=x;
        }
        //return IntStream.of(nums).sum() / nums.length;
        return count/nums.length;

    }

    public static String leo(final int oscar) {
        if (oscar < 86)return "When will you give Leo an Oscar?";
        if (oscar == 86)return "Not even for Wolf of wallstreet?!";
        if (oscar == 87)return "When will you give Leo an Oscar?";
        if (oscar == 88)return  "Leo finally won the oscar! Leo is happy";
        return "Leo got one already!";
    }
//    public static String printArray(Integer array[]) {
//        StringBuilder str = new StringBuilder();
//        for(var x: array) {
//            str.toString(x.split(" "));
//        }
//
//        String x = str.toString();
//        str.replace(' ', ',', x);
//        return x;
//    }

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        for (Integer x : listOfNumbers)
        {
            if (listOfNumbers.get(x)%2 == 0)
            {
                listOfNumbers.remove(x);
            }
        }
        return listOfNumbers;
    }

}
