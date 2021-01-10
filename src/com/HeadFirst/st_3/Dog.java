package com.HeadFirst.st_3;

public class Dog
{
    String name;
    public static void main(String[] args)
    {
        // Создаем объект Dog и получаем к нему доступ
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Барт";
        // Теперь создадим массив типа Dog
        Dog[] myDogs = new Dog[3];
        //и поместим в него несколько элементов
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        // Теперь получаем доступ к объектам Dog с помощью ссыпок из массива
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";
        // Хмммм.,. какое имя у myDogs [2]?
        System.out.print("Имя последней собаки — ");
        System.out.println(myDogs[2].name);
        //Теперь переберём все элементы массива и вызовем для каждого метода bark()
        int x = 0;
        while (x < myDogs.length)
        {
            myDogs[x].bark();
            x++;
        }
    }
    public void bark()
    {
        System.out.println(name + " сказал Гав! ");
    }
    public void eat(){}
    public void chaseCat(){}
}
