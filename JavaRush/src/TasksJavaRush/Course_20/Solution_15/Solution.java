package TasksJavaRush.Course_20.Solution_15;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Сделайте так, чтобы после десериализации нить runner продолжила работать.
 * Ключевые слова объекта runner менять нельзя.
 *
 * Hint/Подсказка:
 * Конструктор не вызывается при десериализации, только инициализируются все поля.
 */
public class Solution implements Serializable, Runnable
{
    transient private Thread runner;
    private int speed;

    public Solution(int speed)
    {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run()
    {
        // do something here, doesn't matter what
    }

    /**
     * Переопределяем сериализацию.
     * Для этого необходимо объявить методы:
     * private void writeObject(ObjectOutputStream out) throws IOException
     * private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     * Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException
    {
        runner = new Thread(this);
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
    {
        runner.start();
        in.defaultReadObject();
    }

    public void javaRush()
    {
        //
    }
}
