package TasksJavaRush.Course_6;

import java.util.ArrayList;

/*
1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat)
в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
 */
public class Solution14 {
    public static ArrayList<Cat1> cats = new ArrayList<>();

    public Solution14() {
    }

    public static void javaRush() {
        for(int i = 0; i < 10; i++) {
            Cat1 cat = new Cat1();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        for (Cat1 cat : cats) {
            System.out.println(cat);
        }
    }
}