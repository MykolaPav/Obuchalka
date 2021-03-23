package TasksJavaRush.Course_16.Solution_32;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
1. В классе Solution создать public static класс нити Read3Strings унаследовавшись от Thread.
2. В методе run реализовать чтение с консоли трех строк.
3. Три подряд введенных строки должны считываться в одной нити и объединяться в одну строку через пробел.
4. В методе main вывести результат для каждой нити.
5. Используй join.

Пример:

Входные данные:   Выходные данные:
a                 a b c
b                 d e f
c
d
e
f
 */
public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void javaRush() throws Exception {
        Read3Strings t1 = new Read3Strings();

        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        public String a;
        public String b;
        public String c;

        @Override
        public void run() {
            try {
                a = reader.readLine();
                b = reader.readLine();
                c = reader.readLine();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        void printResult() {
            System.out.println(a + " " + b + " " + c);
        }
    }
}
