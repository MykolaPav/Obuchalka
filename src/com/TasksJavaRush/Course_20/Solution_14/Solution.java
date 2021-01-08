package com.TasksJavaRush.Course_20.Solution_14;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Сериализуй класс Solution.
 * Подумай, какие поля не нужно сериализовать, пометь ненужные поля модификатором transient.
 * Объект всегда должен содержать актуальные итоговые данные.
 * Метод main не участвует в тестировании.
 */
public class Solution implements Serializable
{
    public void javaRush()
    {
        System.out.println(new Solution(4));
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution() { }

    public Solution(int temperature)
    {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString()
    {
        return this.string;
    }
}
