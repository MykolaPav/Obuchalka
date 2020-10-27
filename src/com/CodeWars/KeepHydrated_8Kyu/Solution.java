package com.CodeWars.KeepHydrated_8Kyu;

/**
 * Because Nathan knows it is important to stay hydrated,
 * he drinks 0.5 litres of water per hour of cycling.
 *
 * You get given the time in hours and you need to return the number of litres Nathan will drink,
 * rounded to the smallest value.
 *
 * For example:
 *
 * time = 3 ----> litres = 1
 *
 * time = 6.7---> litres = 3
 *
 * time = 11.8--> litres = 5
 *
 * Рассчитать сколько литров воды выпивает Натан за прошедшее время.
 * 0.5 литров в час
 * вернуть целое число округлённое вниз
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(liters(5));
        System.out.println(liters(4.7));
        System.out.println(liters(6.8));
    }

    public static int liters(double time)  {
        time = (time * 0.5);
        return  (int)time;
    }
}
