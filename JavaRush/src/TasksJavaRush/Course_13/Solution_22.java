package TasksJavaRush.Course_13;
/*
1. Создай класс StringObject.
2. В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
3. Программа должна компилироваться.
 */
public class Solution_22 {
    public void javaRush()  {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }
    public static class StringObject implements SimpleObject<String>{

        @Override
        public SimpleObject getInstance() {
            return null;
        }
    }
}
