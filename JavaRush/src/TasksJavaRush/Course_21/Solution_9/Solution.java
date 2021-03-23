package TasksJavaRush.Course_21.Solution_9;

/*
Запретить клонирование
*/

public class Solution
{
    public static class A implements Cloneable
    {
        private int i;
        private int j;

        public A(int i, int j)
        {
            this.i = i;
            this.j = j;
        }

        public int getI()
        {
            return i;
        }

        public int getJ()
        {
            return j;
        }

        protected A clone() throws CloneNotSupportedException
        {
            return (A) super.clone();
        }
    }

    public static class B extends A
    {
        private String name;

        protected B clone() throws CloneNotSupportedException
        {
            throw new   CloneNotSupportedException();
        }

        public B(int i, int j, String name)
        {
            super(i, j);
            this.name = name;
        }

        public String getName()
        {
            return name;
        }
    }

    public static class C extends B implements Cloneable
    {
        public C(int i, int j, String name)
        {
            super(i, j, name);
        }

        protected C clone() throws CloneNotSupportedException
        {
            return new C(getI(), getJ(), getName());
        }
    }

    public static void main(String[] args)
    {

    }
}
