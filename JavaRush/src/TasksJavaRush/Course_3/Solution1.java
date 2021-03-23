package TasksJavaRush.Course_3;
/*
Реализуй метод public static void div(int a, int b).
Метод должен делить первое число на второе,
и выводить на экран результат деления а на b.
На экран должно быть выведено целое число.
 */
public class Solution1 {
    public void javaRush(){
        div(6, 3);
        div(10, 6);
        div(2, 4);
    }
    public void div(int a, int b){
        int c;
        c = (a/b);
        System.out.println(c);
    }
}
