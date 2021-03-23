package TasksJavaRush.Course_12;
/*
Добавь такой класс-родитель к классу CTO(технический директор), чтобы класс перестал быть абстрактным.
Добавлять/реализовывать методы в классе CTO запрещается.
 */
public class Solution_29 {
    public void javaRush()  {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends Director implements Businessman {

    }
    public static class Director implements Businessman{
        @Override
        public void workHard() {
        }
    }
}
