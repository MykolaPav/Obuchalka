package com.ZadachiJavaRush.Course_6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
 */
public class Solution21 {
    public void javaRush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandPaName = reader.readLine();
        Cat catGrandPa = new Cat(grandPaName,null, null);

        String grandMaName = reader.readLine();
        Cat catGrandMa = new Cat(grandMaName,null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,null,catGrandPa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMa, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother,catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother,catFather);

        System.out.println(catGrandPa);
        System.out.println(catGrandMa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

    }
    public static class Cat {
        private String name;
        private Cat ma;
        private Cat pa;


        Cat(String name, Cat ma, Cat pa) {
            this.name = name;
            this.ma = ma;
            this.pa = pa;
        }


        @Override
        public String toString() {

            if (ma == null && pa == null)
                return "The cat's name is " + name + ", no mother " + ", no father";
            else if (ma == null)
                return "The cat's name is " + name + ", no mother " + ", father is " + pa.name;
            else if (pa == null)
                return "The cat's name is " + name +", mother is " + ma.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + ma.name + ", father is " + pa.name;
        }
    }
}