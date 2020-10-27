package com.ZadachiJavaRush.Course_20.Solution_18;

import java.io.*;

/**
 * Почему-то при сериализации/десериализации объекта класса B возникают ошибки.
 *
 * Найди проблему и исправь ее.
 *
 * Класс A не должен реализовывать интерфейсы Serializable и Externalizable.
 *
 * В сигнатуре класса В ошибки нет :).
 *
 * В методе main ошибок нет.
 */
public class Solution implements Serializable
{

    public static class A
    {
        public A() { }

        protected String nameA = "A";

        public A(String nameA)
        {
            this.nameA += nameA;
        }

    }

    public class B extends A implements Serializable
    {

        private String nameB;

        public B(String nameA, String nameB)
        {
            super(nameA);
            this.nameA += nameA;
            this.nameB = nameB;
        }
        private void writeObject(ObjectOutputStream oos) throws Exception{
            oos.defaultWriteObject();
            oos.writeObject(nameA);
        }

        private void readObject(ObjectInputStream ois) throws  Exception{
            ois.defaultReadObject();
            nameA = (String) ois.readObject();
        }
    }

    public void javaRush() throws IOException, ClassNotFoundException
    {
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(arrayOutputStream);

        Solution solution = new Solution();
        B b = solution.new B("B2", "C33");
        System.out.println("nameA: " + b.nameA + ", nameB: " + b.nameB);

        oos.writeObject(b);

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(arrayInputStream);

        B b1 = (B) ois.readObject();
        System.out.println("nameA: " + b1.nameA + ", nameB: " + b1.nameB);
    }
}
