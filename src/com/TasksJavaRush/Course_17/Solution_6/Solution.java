package com.TasksJavaRush.Course_17.Solution_6;

/*
И снова Singleton паттерн - синхронизация в статическом блоке.
Внутри класса OurPresident в статическом блоке создайте синхронизированный блок.
Внутри синхронизированного блока инициализируйте president.
 */
public class Solution {

    public void javaRush() throws Exception {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident);
    }

}
