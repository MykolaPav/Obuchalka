package com.TasksJavaRush.Course_13;
/*
В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
 */
public class Solution_7 {
    public void javaRush()  {
        //
    }
    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String> { //допишите здесь ваш код
        @Override
        public SimpleObject getInstance() {
            return null;
        }

    }
}
