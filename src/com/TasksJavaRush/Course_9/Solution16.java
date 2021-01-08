package com.TasksJavaRush.Course_9;

import java.io.IOException;
import java.rmi.RemoteException;

/*
В методе handleExceptions обработайте все checked исключения.
Нужно вывести на экран возникшее checked исключение.
Можно использовать только один блок try..catch
 */
public class Solution16 {
    public void javaRush() throws Throwable {
        handleExceptions(new Sol());
    }

    public static void handleExceptions(Sol obj) {
//        try {
//            obj.method1();
//            obj.method2();
//            obj.method3();
//        } catch (IOException e) {
//            System.out.println(e.toString());
//        } catch (NoSuchFieldException e) {
//            System.out.println(e.toString());
//        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}

class Sol {

    public void method1() {
    }

    public void method2() {
    }

    public void method3() {
    }
}