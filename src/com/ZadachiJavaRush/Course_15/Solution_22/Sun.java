package com.ZadachiJavaRush.Course_15.Solution_22;

public class Sun implements Planet {
    private static Sun instance;
    private Sun() {}

    public static Sun getInstance() {
        if(instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}
