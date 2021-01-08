package com.TasksJavaRush.Course_17.Solution_12_;

public class Table {
    private static byte tableNumber;
    private byte number = ++tableNumber;

    public Order getOrder() {
        return new Order(number);
    }
}