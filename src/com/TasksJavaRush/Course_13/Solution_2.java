package com.TasksJavaRush.Course_13;
/*
Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все его методы.
 */
public class Solution_2 {
    public void javaRush()  {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink{
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }

        }

        @Override
        public boolean isAlcoholic() {
            return false;
        }
    }
}
