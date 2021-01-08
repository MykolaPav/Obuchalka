package com.TasksJavaRush.Course_20.Solution_7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Сделай так, чтобы сериализация класса JavaRush была возможной.
 */
public class Solution {
    //тут нужно имплементировать Serializable
    public static class JavaRush implements Serializable {
        public List<User> users = new ArrayList<>();
    }
    public void javaRush() {
        //
    }
}
