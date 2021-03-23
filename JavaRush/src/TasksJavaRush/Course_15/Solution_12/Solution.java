package TasksJavaRush.Course_15.Solution_12;

/*
Посмотри, что, связанное с конструкторами, может быть добавлено при компиляции, но в этой программе уже присутствует.
Упрости код - удали все конструкторы и вызовы конструкторов супер-классов, которые создаются и добавляются автоматически.

PS: Взаимосвязь между объектами классов NakedCat и NormalCat, SiamCat - Is-a (наследование): http://en.wikipedia.org/wiki/Is-a
 */
public class Solution {
    public void javaRush() throws Exception {
        SiamCat simka = new SiamCat("Simka");

    }

    public static class NakedCat {

    }

    public static class NormalCat extends NakedCat {

        public NormalCat() {
        }

        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }

    }

    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
            super(name);
        }
    }
}
