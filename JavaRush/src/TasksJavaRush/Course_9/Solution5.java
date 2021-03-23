package TasksJavaRush.Course_9;

import java.io.IOException;

/*
Написать метод, который возвращает результат - глубину его стек-трейса
- количество методов в нем (количество элементов в списке).
Это же число метод должен выводить на экран.
 */
public class Solution5 {
    public void javaRush() throws IOException {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        int x = Thread.currentThread().getStackTrace().length;

        System.out.println(x);
        return x;
    }
}
