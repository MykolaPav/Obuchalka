package com.ZadachiJavaRush.Course_13;

import java.awt.*;

/*
1. Исправь класс BigFox так, чтобы программа компилировалась.
 */
public class Solution_14 {
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

    public static class BigFox  extends Fox {
        @Override
        public Color getColor() {
            return Color.GRAY;
        }
    }
}
