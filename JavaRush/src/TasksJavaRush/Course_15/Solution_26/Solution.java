package TasksJavaRush.Course_15.Solution_26;

/*
1. В классе Solution создай 4 конструктора с разными модификаторами доступа.
2. В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
3. Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
4. Исправь модификаторы доступа конструкторов в SubSolution так,
   чтобы получилось 3 конструктора с различными модификаторами доступа(все кроме private).
 */
public class Solution {
    public void javaRush() throws Exception {
        //
    }

    public Solution() {}
    private Solution(Double d){}
    protected Solution(int i){}
    Solution(double x){}
}
