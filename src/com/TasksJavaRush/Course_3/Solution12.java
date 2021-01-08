package com.TasksJavaRush.Course_3;
/*
Добавь метод public static int convertToSeconds(int hour)
который будет конвертировать часы в секунды.
Вызови его дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.
 */
public class Solution12 {
    public void javaRush(){
        System.out.println(convertToSecond(45));
        System.out.println(convertToSecond(12));
    }
    public int  convertToSecond(int hour){
        return hour*3600;
    }
}
