package TasksJavaRush.Course_12;
/*
Исправь код, чтобы программа компилировалась.

Подсказка:
метод getChild должен остаться абстрактным.
 */
public class Solution_12 {
    public void javaRush()  {
        //
    }
    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}
