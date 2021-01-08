package com.TasksJavaRush.Course_13;
/*
1. Создай интерфейс CanMove с методом speed.
2. Метод speed должен возвращать значение типа Double и не должен ничего принимать в качестве аргументов.
3. Создай и унаследуй интерфейс CanFly от интерфейса CanMove.
4. Добавь в интерфейс CanFly метод speed.
5. Метод speed должен возвращать значение типа Double и принимать один параметр типа CanFly.
 */
public class Solution_9 {
    public void javaRush()  {
        //
    }
    public interface CanMove{
        Double speed();
    }
    public interface CanFly extends CanMove {
        Double speed(CanFly t);
    }
}
