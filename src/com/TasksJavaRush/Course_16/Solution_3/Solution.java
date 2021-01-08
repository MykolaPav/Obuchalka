package com.TasksJavaRush.Course_16.Solution_3;

import java.util.ArrayList;
import java.util.List;

/*
В методе main добавить в статический объект list 5 нитей.
Каждая нить должна быть новым объектом класса Thread, работающим со своим объектом класса SpecialThread.
 */

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);
    public void javaRush() throws Exception {
        //Add your code here - добавьте свой код тут
        for (int i = 0; i < 5; i++) {
            SpecialThread thread = new SpecialThread();
            list.add(new Thread(thread));
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
