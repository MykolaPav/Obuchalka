package com.ZadachiJavaRush.Course_14.Factory;

public class Solution {
    public void javaRush() {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(Country.RUSSIA)) {
                System.out.println();
            }if (country.equals(Country.UKRAINE)) {
                return new UkrainianHen();
            }if (country.equals(Country.MOLDOVA)) {
                return new MoldovanHen();
            }if (country.equals(Country.BELARUS)) {
                return new BelarusianHen();
            }
            return hen;
        }
    }
}

