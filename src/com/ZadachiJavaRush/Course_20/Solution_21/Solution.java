package com.ZadachiJavaRush.Course_20.Solution_21;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Запрети сериализацию класса SubSolution используя NotSerializableException.
 * Сигнатуры классов менять нельзя.
 */
public class Solution implements Serializable
{
     public static class SubSolution extends Solution
     {
         private void writeObject(ObjectOutputStream oos) throws Exception
         {
             throw new NotSerializableException();
         }

         private void readObject(ObjectInputStream ois) throws  Exception
         {
             throw new NotSerializableException();
         }
    }

    public static void main(String[] args)
    {
        //
    }
}

