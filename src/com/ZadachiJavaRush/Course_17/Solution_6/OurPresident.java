package com.ZadachiJavaRush.Course_17.Solution_6;

public class OurPresident {
    private static OurPresident president;

    private OurPresident() {
    }

    static {
        synchronized (president = new OurPresident()) {
        }
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
