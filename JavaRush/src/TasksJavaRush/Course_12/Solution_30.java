package TasksJavaRush.Course_12;
/*
Добавь еще один метод, чтобы программа выводила на экран число 10.

Подсказка:
используй перегрузку методов.
 */
public class Solution_30 {
    public void javaRush()  {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i) {
        return i * i;
    }
    public static int transformValue(Integer i) {
        return i + i;
    }

}
