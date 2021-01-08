package com.TasksJavaRush.Course_20.Solution_11;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Реализуй интерфейс Externalizable в классе Apartment.
 */
public class Solution  {
//добавить  implements Externalizable и реализовать методы интерфейса
    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() {
            super();
        }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return ("Address: " + address + "\n" + "Year: " + year);
        }
    //метод  writeExternal интерфейса Externalizable
        @Override
        public void writeExternal(ObjectOutput out) throws IOException
        {
            out.writeObject(address);
            out.writeInt(year);
        }
    //метод  readExternal интерфейса Externalizable
        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
        {
           address = (String) in.readObject();
           year = in.readInt();
        }
    }

    public void javaRush() {
        //
    }
}
