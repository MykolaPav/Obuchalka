package com.ZadachiJavaRush.Course_14.Factory;

public class RussianHen extends Hen implements Country {
    int getCountOfEggsPerMonth() {
        return 65;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.RUSSIA +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
