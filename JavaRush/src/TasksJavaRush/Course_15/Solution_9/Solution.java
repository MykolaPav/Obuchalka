package TasksJavaRush.Course_15.Solution_9;

/*
1. Изменить метод printName так, чтобы он выполнялся для man и woman.
2. Реализация метода printName должна быть одна.
 */
public class Solution {
    public void javaRush() throws Exception {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }
    public static void printName(Human man) {

    }

    public static class Human {

    }

    public static class Man extends Human {

    }

    public static class Woman extends Human{

    }
}
