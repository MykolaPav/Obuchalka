package TasksJavaRush.Course_8;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/*
1. Внутри класса Solution создать public static класс кот - Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.
 */
public class Solution20 {
    public void javaRush() throws IOException {
        Set<Cat> cats = createCats();
        cats.remove(cats.iterator().next());

        printCats(cats);
    }
//____________________________________________________________________________
    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        return cats;
    }
//____________________________________________________________________________
    public static void printCats(Set<Cat> cats) {
        for(Cat x : cats) {
            System.out.println(x);
        }
    }
//____________________________________________________________________________
    public static class Cat{
    }
}

