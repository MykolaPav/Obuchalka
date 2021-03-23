package TasksJavaRush.Course_9;

/*
Расставь модификаторы static так, чтобы пример скомпилировался.
 */
public class Solution25 {
    public static int A = 5;
    public static int B = 2 * A;
    public  int C = A * B;
    public static int D = A * B;
    public static void javaRush()  {
        Solution25 room = new Solution25();
        room.A = 5;

        Solution25.D = 5;
    }
    public  int getA() {
        return A;
    }
     static class Solution{
    }
}

