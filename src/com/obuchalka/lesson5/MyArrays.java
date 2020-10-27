package com.obuchalka.lesson5;

public class MyArrays {

    int [] array = new int[3];
    Candy [] box = new Candy[5];

//    int [] array2 = {1,2,3,7};
//
//    Candy candyFirst = new Candy();
//    Candy candySecond = new Candy();
//    Candy candyThird = new Candy();
//
//    Candy [] box2 = {candyFirst,candySecond,candyThird};
//
//    Candy [] box3;

    public void foo() {
        Candy candy = new Candy();
        box[0] = candy;
        System.out.println(box[0]);
    }
}
