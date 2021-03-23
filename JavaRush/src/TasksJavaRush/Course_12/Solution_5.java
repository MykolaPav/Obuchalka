package TasksJavaRush.Course_12;

/*
Написать метод, который определяет, объект какого класса ему передали,
и возвращает результат - одно значение из: "Корова", "Кит", "Собака", "Неизвестное животное".
 */
public class Solution_5 {
    public void javaRush() {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Cow) {
            return (String) (o = ("Корова"));
        } else if (o instanceof Whale) {
            return (String) (o = "Кит");
        } else if (o instanceof Dog) {
            return (String) (o = "Собака");
        } else
            return "Неизвестное животное";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
