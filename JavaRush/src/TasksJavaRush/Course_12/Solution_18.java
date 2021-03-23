package TasksJavaRush.Course_12;
/*
Есть public интерфейсы CanFly(летать), CanMove(передвигаться), CanEat(есть).
Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).
 */
public class Solution_18 {
    public void javaRush()  {
        //
    }
    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        @Override
        public void move() {
        }
        @Override
        public void eat(){
        }
    }

    public class Duck implements CanMove, CanFly, CanEat {
        @Override
        public void move() {
        }
        @Override
        public void fly() {
        }
        @Override
        public void eat() {
        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {
        }
    }

    public class Airplane implements CanMove, CanFly {
        @Override
        public void move() {
        }
        @Override
        public void fly() {
        }
    }
}
