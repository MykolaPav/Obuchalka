package com.TasksJavaRush.Course_15.Solution_25;

public class Earth implements Planet {
    private static Earth instance;
    private Earth (){}

    public static Earth getInstance() {
        if(instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}
