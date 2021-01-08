package com.TasksJavaRush.Course_8;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/*
1. Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки.
 */
public class Solution21 {
    public void javaRush() throws IOException {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

//____________________________________________________________________________
    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        return cats;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            Dog dog = new Dog();
            dogs.add(dog);
        }
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }
//____________________________________________________________________________

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object x : pets)
            System.out.println(x);
    }
//____________________________________________________________________________
    public static class Cat {
    }

    public static class Dog {
    }
}
