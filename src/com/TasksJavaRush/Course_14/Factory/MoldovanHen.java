package com.TasksJavaRush.Course_14.Factory;

public class MoldovanHen extends Hen implements Country {
    int getCountOfEggsPerMonth() {
        return 45;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - "  + Country.MOLDOVA +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
    }
}
