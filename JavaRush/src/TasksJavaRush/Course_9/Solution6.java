package TasksJavaRush.Course_9;

import java.io.IOException;

/*
Реализовать метод log.
Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
Имя класса, имя метода и сообщение разделить двоеточием с пробелом.

Пример вывода:
com.javarush.task.task09.task0906.Solution:
main: In main method
 */
public class Solution6 {
    public void javaRush() throws IOException {
        log("In main method");
    }

    public static void log(String s) {
        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(className + ": ");
        System.out.println(methodName + ": " + s);
    }
}
