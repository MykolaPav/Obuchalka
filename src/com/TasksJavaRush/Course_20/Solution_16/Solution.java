package com.TasksJavaRush.Course_20.Solution_16;

import java.io.Serializable;

/**
 * Используя минимум изменений кода сделайте так,
 * чтобы сериализация класса C стала возможной.
 */
public class Solution
{
    //добавил implements Serializable классу А и static для внутренних классов
    public static class A implements Serializable
    {
        String name = "A";

        public A(String name)
        {
            this.name += name;
        }

        @Override
        public String toString()
        {
            return name;
        }
    }

    public static class B extends A
    {
        String name = "B";

        public B(String name)
        {
            super(name);
            this.name += name;
        }
    }

    public static class C extends B
    {
        String name = "C";

        public C(String name)
        {
            super(name);
            this.name = name;
        }
    }


    public static void main(String[] args)
    {
        //
    }
}
