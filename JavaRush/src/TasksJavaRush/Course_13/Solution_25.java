package TasksJavaRush.Course_13;

import java.awt.*;

/*
1. Исправь классы Fox и BigFox так, чтобы программа компилировалась.
Задача не предполагает создания экземпляров базового класса.
2. Метод main менять нельзя.
 */
public class Solution_25 {
    public void javaRush()  {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public  static  class BigFox extends Fox {

        @Override
        public Color getColor() {
            return Color.GRAY;
        }
    }
}
