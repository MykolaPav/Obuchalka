package com.ZadachiJavaRush.Course_14.Solution_17;

public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }
    @Override
    public String getCurrencyName(){
        return "USD";
    }
}
