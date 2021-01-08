package com.TasksJavaRush.Course_12;
/*
Унаследуй класс Cow от Animal.
Реализуй все недостающие методы в классе Cow.
 */
public class Solution_14 {
    public void javaRush()  {
        //
    }
    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        @Override
        public String getName() {
            return "null";
        }
    }
}
