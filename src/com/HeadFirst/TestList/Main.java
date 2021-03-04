package com.HeadFirst.TestList;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args) {
        ArrayList<Animal> animals;  animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        print(animals);
    }

    public static void print(ArrayList<Animal> animals){
        for (Animal x : animals){
           if (x instanceof Dog) {
               x.eat();
           }
           if (x instanceof Cat){
               x.makeVoice();
           }
        }
    }
}
