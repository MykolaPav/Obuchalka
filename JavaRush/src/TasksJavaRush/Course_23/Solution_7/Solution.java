package TasksJavaRush.Course_23.Solution_7;


/*
Как выбрать нужное?
*/

public class Solution
{
    public static final String TEST = "test";

    public static class TEST
    {
        @Override
        public String toString()
        {
            return "test class";
        }
    }

    static Object obj;

    public static void main(String[] args)
    {
        obj = new Solution.TEST();
        System.out.println(obj);
    }
}
