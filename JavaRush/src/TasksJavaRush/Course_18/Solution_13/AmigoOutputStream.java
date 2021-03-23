package TasksJavaRush.Course_18.Solution_13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
1 Измени класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream.
  Используй наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 Вызвать метод flush().
2.2 Дописать следующий текст "JavaRush © All rights reserved.", используй метод getBytes().
2.3 Закрыть поток методом close().
*/
public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream stream;

    public static void javaRush() throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    public AmigoOutputStream(FileOutputStream fos) throws FileNotFoundException {
        super(fileName);
        this.stream = fos;
    }
    @Override
    public void write(int b) throws IOException {
        stream.write(b);
    }
    @Override
    public void write(byte[] b) throws IOException {
        stream.write(b);
    }
    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        stream.write(b, off, len);
    }
    @Override
    public void flush() throws IOException {
        stream.flush();
    }
    @Override
    public void close() throws IOException {
        flush();
        write("JavaRush © All rights reserved.".getBytes());
        stream.close();
    }
}
