package com.TasksJavaRush.Course_14;

import java.io.IOException;

/*
Исправь строчку 'Cat cat = new Cat();' так, чтобы программа вывела "Bingo!".
 */
public class Solution_2 {
    public void javaRush() throws IOException {
        Cat cat = new TomCat();

        boolean isCat = cat instanceof Cat;
        boolean isMovable = cat instanceof CanMove;
        boolean isTom = cat instanceof TomCat;

        if (isCat && isMovable && isTom) System.out.println("Bingo!");
    }

    interface CanMove {
    }

    static class Cat implements CanMove {
    }

    static class TomCat extends Cat {

    }
}
