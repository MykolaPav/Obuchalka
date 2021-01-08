package com.TasksJavaRush.Course_13;
/*
Реализовать интерфейс Updatable в классе Screen.
 */
public class Solution_23 {
    public void javaRush()  {
        //
    }
    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable {

        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}
