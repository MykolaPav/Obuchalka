package com.ZadachiJavaRush.Course_14.Factory;

public class UkrainianHen extends Hen implements Country {
    int getCountOfEggsPerMonth() {
        return 70;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.UKRAINE +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
