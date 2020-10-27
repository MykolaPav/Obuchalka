package com.ZadachiJavaRush.Course_15.Solution_22;

import java.util.Scanner;

/*
1. Найти пример реализации паттерна Singleton с ленивой реализацией(lazy initialization).
Используй свой любимый поисковик(например google).
2. По образу и подобию в отдельных файлах создай три класса синглтона Sun, Moon, Earth.
3. Реализуй интерфейс Planet в классах Sun, Moon, Earth.
4. В статическом блоке класса Solution вызови метод readKeyFromConsoleAndInitPlanet.
5. Реализуй функционал метода readKeyFromConsoleAndInitPlanet:
5.1. С консоли считай один параметр типа String.
5.2. Если параметр равен одной из констант интерфейса Planet,
создай соответствующий объект и присвой его Planet thePlanet, иначе обнулить Planet thePlanet.
 */
public class Solution_22 {
    public void javaRush() throws Exception {
        //
    }
    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        Scanner sc = new Scanner(System.in);
        String pln = sc.nextLine();
        if (pln.equals(Planet.SUN)){
            thePlanet = Sun.getInstance();
        }
        else if (pln.equals(Planet.MOON)){
            thePlanet = Moon.getInstance();
        }
        else if (pln.equals(Planet.EARTH)){
            thePlanet = Earth.getInstance();
        }
        else {
             thePlanet = null;
        }
    }

}
