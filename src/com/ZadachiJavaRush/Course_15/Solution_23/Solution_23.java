package com.ZadachiJavaRush.Course_15.Solution_23;

/*
1. В классе Solution создай 4 конструктора с разными модификаторами доступа.
2. В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
3. Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
4. Исправь модификаторы доступа конструкторов в SubSolution так,
   чтобы получилось 3 конструктора с различными модификаторами доступа(все кроме private).
 */
public class Solution_23 {
    public void javaRush() throws Exception {
        //
    }

    public Solution_23() {}
    private  Solution_23(Double d){}
    protected  Solution_23(int i){}
    Solution_23(double x){}
}
