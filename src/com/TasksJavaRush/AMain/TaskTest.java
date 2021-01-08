package com.TasksJavaRush.AMain;

/**
 * Разные примеры
 * проверяю как они работают
 */
public class TaskTest {

   public static KClass kClass = new KClass();

    public static void main(String[] args) {
        System.out.println(setAlarm(true, true));
        System.out.println(setAlarm(false, true));
        System.out.println(setAlarm(false, false));
        System.out.println(setAlarm( true, false));
    }

    public static boolean setAlarm(boolean employed, boolean vacation) {
        // Your code here...
        return employed & !vacation;
    }
}
