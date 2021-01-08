package com.TasksJavaRush.Course_13;
/*
Исправь 4 ошибки в программе, чтобы она компилировалась.
 */
public class Solution_5 {
    public void javaRush()  {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream extends Desire {
          Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Dream,Desire {
         int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
