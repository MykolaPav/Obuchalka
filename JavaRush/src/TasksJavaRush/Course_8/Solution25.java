package TasksJavaRush.Course_8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
 */
public class Solution25 {
    public void javaRush() throws IOException {
        ArrayList<String> children = new ArrayList<>();
        children.add("Egor");
        children.add("Sasha");
        children.add("Lena");

        Human children1 = new Human("Egor", true, 18);
        Human children2 = new Human("Sasha", true, 18);
        Human children3 = new Human("Lena", false, 18);
        Human father = new Human("Vova", true, 45, new ArrayList<Human>(Arrays.asList(children1, children2, children3)));
        Human mother = new Human("Toma", false, 45, new ArrayList<Human>(Arrays.asList(children1, children2, children3)));
        Human grandFather1 = new Human("Zhenya", true, 80, new ArrayList<Human>(Arrays.asList(father)));
        Human grandFather2 = new Human("Vasya", true, 85, new ArrayList<Human>(Arrays.asList(father)));
        Human grandMother1 = new Human("Katya", false, 74, new ArrayList<Human>(Arrays.asList(mother)));
        Human grandMother2 = new Human("Motya", false, 76, new ArrayList<Human>(Arrays.asList(mother)));
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
            System.out.println(this.toString());
        }


        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            System.out.println(this.toString());
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
