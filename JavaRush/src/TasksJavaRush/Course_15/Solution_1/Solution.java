package TasksJavaRush.Course_15.Solution_1;

/*
1. Добавь все возможные интерфейсы из Movable, Sellable, Discountable в класс Clothes.
2. Реализуй их методы.
 */
public class Solution {
    public void javaRush() throws Exception {
        //
    }
    public interface Movable  {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {
        @Override
        public boolean isMovable() {
            return false;
        }

        @Override
        public Object getAllowedAction(String name) {
            return null;
        }

        @Override
        public Object getAllowedAction() {
            return null;
        }
    }
}
