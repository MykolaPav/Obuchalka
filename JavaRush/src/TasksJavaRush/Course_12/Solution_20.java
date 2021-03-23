package TasksJavaRush.Course_12;
/*
Напиши public класс Human(человек) и public интерфейсы CanRun(бежать/ездить), CanSwim(плавать).
Добавь в каждый интерфейс по oдному методу.
Добавь эти интерфейсы классу Human, но не реализуй методы.
Объяви класс Human абстрактным.
 */
public class Solution_20 {
    public void javaRush()  {
        //
    }
    public abstract class Human implements CanRun, CanSwim{

    }
    public interface CanRun {
        public void run();
    }
    public interface CanSwim {
        public void swim();
    }

}
