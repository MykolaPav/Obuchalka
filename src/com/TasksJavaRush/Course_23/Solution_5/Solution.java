package com.TasksJavaRush.Course_23.Solution_5;

/*
Inner
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions()
    {
        Solution[] sol = new Solution[] {new Solution(), new Solution()};
        sol[0].innerClasses[0] = sol[1].innerClasses[0] = new Solution().new InnerClass();
        sol[0].innerClasses[1] = sol[1].innerClasses[1] = new Solution().new InnerClass();
        return sol;
    }

    public static void main(String[] args) {
        //
    }

}
