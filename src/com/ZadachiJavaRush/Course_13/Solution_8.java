package com.ZadachiJavaRush.Course_13;
/*
1. Создай интерфейс Person.
2. Добавь в него метод isAlive(), который проверяет, жив человек или нет.
3. Подумай, какой тип должен возвращать этот метод.
4. Создай интерфейс Presentable.
5. Унаследуй интерфейс Presentable от интерфейса Person.
 */
public class Solution_8 {
    public void javaRush()  {
        //
    }
    public  interface Person{
        boolean isAlive();
    }
    public interface Presentable extends Person{

    }

}
