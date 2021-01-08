package com.TasksJavaRush.Course_2;
/*
Создай объект типа Cat (кот), объект типа Dog (собака),
объект типа Fish (рыбка) и объект типа Woman.
Присвой каждому животному владельца (owner).
 */
public class Solution12 {
    public void javaRush(){
        Cat cat = new Cat();
        cat.owner = new Woman();
        Dog dog = new Dog();
        dog.owner = new Woman();
        Fish fish = new Fish();
        fish.owner = new Woman();
        Woman woman = new Woman();
    }
    public class Cat{
        public Woman owner;
    }
    public class Dog{
        public Woman owner;
    }
    public class Fish{
        public Woman owner;
    }
    public class Woman{
    }
}
