package com.TasksJavaRush.Course_24.Solution_6;

import java.math.BigDecimal;

/*
Наследование от внутреннего класса
*/

public class Solution
{
    public class Building
    {
        public class Hall
        {
            private BigDecimal square;

            public Hall(BigDecimal square)
            {
                this.square = square;
            }
        }

        public class Apartments
        {
            //
        }
    }

    public class Apt3Bedroom extends Building.Apartments
    {
        Apt3Bedroom(Building building)
        {
            building.super();
        }
    }

    public class BigHall extends Building.Hall
    {
       public BigHall(Building building)
        {
            building.super(new BigDecimal(100));
        }
    }

    public static void main(String[] args)
    {
        //
    }
}
