package com.ZadachiJavaRush.Course_13.Repka;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void javaRush()  {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}
