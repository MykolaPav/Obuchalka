package com.ZadachiJavaRush.Course_5;
import java.io.IOException;

/*
Пару задач назад студенты секретного центра JavaRush создавали класс Cat.
Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat,
а точнее - основываясь на нём, как на шаблоне. Их - котов - должно быть трое.
Наполните этих троих жизнью, то есть, конкретными данными.
 */
public class Solution4 {
    public void javaRush() throws IOException {
        Cat cat1 = new Cat("Tom",5,4,7);
        Cat cat2 = new Cat("Bob",2,5,8);
        Cat cat3 = new Cat("Cat",3,7,4);
    }
    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
