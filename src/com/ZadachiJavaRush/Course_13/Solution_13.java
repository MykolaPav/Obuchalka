package com.ZadachiJavaRush.Course_13;

import java.awt.*;

/*
1. Реализуй в классе Fox интерфейс Animal.
2. Поменяй код так, чтобы в классе Fox был только один метод - getName.
3. Создавать дополнительные классы и удалять методы нельзя!
 */
public class Solution_13 {
    public void javaRush()  {
        //
    }
    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
