package TasksJavaRush.Course_24.Solution_3;

/*
Так-с... сопоставим
*/

import java.io.Serializable;
import java.rmi.Remote;
import java.util.ArrayDeque;
import java.util.EventListener;

public class Solution
{
    public static class A implements Serializable
    {
        protected A clone() throws CloneNotSupportedException
        {
            return (A) super.clone();
        }
    }

    public static class B implements Remote
    {
        protected final B clone() throws CloneNotSupportedException
        {
            return (B) super.clone();
        }
    }

    public static class C extends ArrayDeque
    {
        public C clone() {
            return (C) super.clone();
        }
    }

    public static class D implements EventListener
    {
        protected D clone() throws CloneNotSupportedException
        {
            return (D) super.clone();
        }
    }

    public static void main(String[] args)
    {
        //
    }
}