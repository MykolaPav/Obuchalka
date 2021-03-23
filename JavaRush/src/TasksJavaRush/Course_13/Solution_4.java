package TasksJavaRush.Course_13;
/*
Создай класс Screen и реализуй в нем интерфейсы Selectable и Updatable.
Не забудь реализовать методы!
 */
public class Solution_4 {
    public void javaRush()  {
        //
    }
    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public class Screen implements Selectable, Updatable{
        @Override
        public void onSelect() {
        }
        @Override
        public void refresh() {
        }
    }
}
