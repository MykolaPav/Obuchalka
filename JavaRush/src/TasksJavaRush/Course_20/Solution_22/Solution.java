package TasksJavaRush.Course_20.Solution_22;

import java.io.*;

/**
 * Сериализация/десериализация Solution не работает.
 * Исправь ошибки не меняя сигнатуры методов и класса.
 * Метод main не участвует в тестировании.
 *
 * Написать код проверки самостоятельно в методе main:
 * 1) создать экземпляр класса Solution
 * 2) записать в него данные - writeObject
 * 3) сериализовать класс Solution - writeObject(ObjectOutputStream out)
 * 4) десериализовать, получаем новый объект
 * 5) записать в новый объект данные - writeObject
 * 6) проверить, что в файле есть данные из п.2 и п.5
 */
public class Solution implements Serializable, AutoCloseable
{
    private transient FileOutputStream stream;
    //добавить поле fileName
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException
    {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException
    {
        stream.write(string.getBytes());
        stream.write("\r\n".getBytes());
        stream.flush();
    }
    //закомментировать закрытия потоков
    private void writeObject(ObjectOutputStream out) throws IOException
    {
        out.defaultWriteObject();
       // out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
    {
        in.defaultReadObject();
        //создать новый объект потока с параметрами
        stream = new FileOutputStream(fileName, true);
        // in.close();
    }

    @Override
    public void close() throws Exception
    {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args)
    {
        //
    }
}
