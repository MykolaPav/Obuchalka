package com.ZadachiJavaRush.Course_14.Solution_17;

public class Ruble extends Money {
    public Ruble(double amount) {
        super(amount);
    }
    @Override
   public String getCurrencyName(){
        return "RUB";
    }
}
