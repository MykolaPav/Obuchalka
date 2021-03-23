package TasksJavaRush.Course_19.Solution_17;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Реализовать логику FileConsoleWriter.
 * Класс FileConsoleWriter должен содержать приватное поле FileWriter fileWriter.
 * Класс FileConsoleWriter должен содержать все конструкторы, которые инициализируют fileWriter для записи.
 * Класс FileConsoleWriter должен содержать пять методов write и один метод close:
 *
 * public void write(char[] cbuf, int off, int len) throws IOException
 * public void write(int c) throws IOException
 * public void write(String str) throws IOException
 * public void write(String str, int off, int len) throws IOException
 * public void write(char[] cbuf) throws IOException
 * public void close() throws IOException
 * При записи данных в файл, должен дублировать эти данные на консоль.
 */
public class FileConsoleWriter {
    private FileWriter fileWriter;

    public FileConsoleWriter(String fileName) throws IOException {
        this.fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        this.fileWriter = new FileWriter(fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) {
        this.fileWriter = new FileWriter(fd);
    }
//__________________________________________________________________________________________________________
    public void write(char[] cbuf, int off, int len) throws IOException {
        this.fileWriter.write(cbuf, off, len);
        System.out.println(String.valueOf(cbuf).substring(off, off+len));

    }
    public void write(int c) throws IOException{
        fileWriter.write(c);
        System.out.println(c);
    }
    public void write(String str) throws IOException{
        fileWriter.write(str);
        System.out.println(str);
    }
    public void write(String str, int off, int len) throws IOException{
        this.fileWriter.write(str, off, len);
        System.out.println(str.substring(off, off+len));

    }
    public void write(char[] cbuf) throws IOException{
        this.fileWriter.write(cbuf);
        System.out.println(String.valueOf(cbuf));
    }

    public void close() throws IOException{
        fileWriter.close();
    }

    public void javaRush() {
        //
    }
}
