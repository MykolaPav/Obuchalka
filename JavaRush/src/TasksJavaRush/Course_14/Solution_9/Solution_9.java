package TasksJavaRush.Course_14.Solution_9;

import java.io.IOException;

/*
1. Создать интерфейс Bridge с методом int getCarsCount().
2. Создать классы WaterBridge и SuspensionBridge, которые реализуют интерфейс Bridge.
3. Метод getCarsCount() должен возвращать любое фиксированное значение типа int.
4. Метод getCarsCount() должен возвращать различные значения для различных классов.
5. В классе Solution создать публичный метод println(Bridge bridge).
6. В методе println вывести на консоль значение getCarsCount() для объекта bridge.
7. Каждый класс и интерфейс должны быть в отдельных файлах.
 */
public class Solution_9 {
    public void javaRush() throws IOException {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }
public static void println(Bridge bridge){
    System.out.println(bridge.getCarsCount());
}

}
