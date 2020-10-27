package com.ZadachiJavaRush.Course_20.Solution_17;

import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * На вход подается поток, в который записан сериализованный объект класса A либо класса B.
 * Десериализуй объект в методе getOriginalObject так,
 * чтобы в случае возникновения исключения было выведено сообщение на экран и возвращен null.
 * Реализуй интерфейс Serializable где необходимо.
 */
public class Solution
{

    public A getOriginalObject(ObjectInputStream objectStream)
    {
        try
        {
           return (A) objectStream.readObject();
        }
        catch (Exception e)
        {
            return null;
        }
    }

    public class A implements Serializable
    {
    }

    public class B extends A
    {
        public B()
        {
            System.out.println("inside B");
        }
    }

    public void javaRush()
    {
        //
    }
}
