package TasksJavaRush.Course_7;

import java.io.IOException;

/*
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human,
то именно он будет использоваться при выводе объекта на экран.
 */
public class Solution24 {
    public void javaRush() throws IOException {
        Human grandFather1 = new Human("Zhenya", true, 80);
        Human grandFather2 = new Human("Vasya", true, 85);
        Human grandMother1 = new Human("Katya", false, 74);
        Human grandMother2 = new Human("Motya", false, 76);
        Human father = new Human("Vova", true, 45, grandFather1, grandMother1);
        Human mother = new Human("Toma", false, 45, grandFather2, grandMother2);
        Human children1 = new Human("Egor", true, 18, father, mother);
        Human children2 = new Human("Sasha", true, 18,father, mother);
        Human children3 = new Human("Lena", false, 18,father, mother);



        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
    }
    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
