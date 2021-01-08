package com.TasksJavaRush.Course_12;
/*
Есть интерфейсы CanFly(летать), CanSwim(плавать), CanRun(бегать).
Добавь эти интерфейсы классам Duck(утка), Penguin(пингвин), Toad(жаба)
 */
public class Solution_27 {
    public void javaRush()  {
        //
    }
    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public class Duck implements CanFly, CanRun, CanSwim {
        @Override
        public void fly() { }
        @Override
        public void run() { }
        @Override
        public void swim() { }
    }

    public class Penguin implements CanRun, CanSwim {
        @Override
        public void run() { }
        @Override
        public void swim() { }
    }

    public class Toad implements CanSwim {
        @Override
        public void swim() { }
    }
}
