package com.TasksJavaRush.Course_13;
/*
1. Добавь интерфейсы Secretary и Boss к классам Manager и Subordinate. По одному на каждый. Подумай, кому какой.
2. Унаследуй интерфейсы Secretary и Boss от интерфейсов Person и HasManagementPotential так,
чтобы все методы у классов Manager и Subordinate оказались объявленными в каком-то интерфейсе.
 */
public class Solution_10 {
    public void javaRush()  {
        //
    }
    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }

    interface Secretary extends Person{
    }

    interface Boss extends HasManagementPotential, Person {
    }

    class Manager implements Boss{
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate implements Secretary {
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}
