package com.CodeWars.ExpressionsMatter_8Kyu;

/**
 * Given three integers a ,b ,c, return the largest number obtained
 * after inserting the following operators and brackets: +, *, ()
 * In other words , try every combination of a,b,c with [*+()] , and return the Maximum Obtained
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(expressionsMatter(2, 1, 2));
        System.out.println(expressionsMatter(1, 1, 1));
        System.out.println(expressionsMatter(2, 1, 1));
        System.out.println(expressionsMatter(1, 2, 3));
        System.out.println(expressionsMatter(1, 3, 1));
        System.out.println(expressionsMatter(2, 2, 2));

        System.out.println("");

        System.out.println(expressionsMatter(5, 1, 3));
        System.out.println(expressionsMatter(3, 5, 7));
        System.out.println(expressionsMatter(5, 6, 1));
        System.out.println(expressionsMatter(1, 6, 1));
        System.out.println(expressionsMatter(2, 6, 1));
        System.out.println(expressionsMatter(6, 7, 1));

        System.out.println("");

        System.out.println(expressionsMatter( 2, 10,  3));
        System.out.println(expressionsMatter(1,  8,  3));
        System.out.println(expressionsMatter(9,  7,  2));
        System.out.println(expressionsMatter(1,  1, 10));
        System.out.println(expressionsMatter(9,  1,  1));
        System.out.println(expressionsMatter(10,  5,  6));
        System.out.println(expressionsMatter(1, 10,  1));
    }

    public static int expressionsMatter(int a, int b, int c)
    {
        // Your Code here... Happy Coding!
        int max, max1, max2, max3, max4, max5  = 0;
        max1 = a * (b + c);
        max2 = a * b * c;
        max3 = a + b * c;
        max4 = (a + b) * c;
        max5 = a + b + c;
        max =  Math.max(Math.max(max1, max2), Math.max(max3, max4));
        return  Math.max(max, max5);
    }
}
