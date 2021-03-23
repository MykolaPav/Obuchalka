package TasksJavaRush.Course_2;
/*
Допиши код в методе print,
чтобы он выводил на экран каждую переданную в него строку 4 раза.
Каждый раз с новой строки.

Например, при таком вызове:
print("Java opens many opportunities!");

На экран должно быть выведено:
Java opens many opportunities!
Java opens many opportunities!
Java opens many opportunities!
Java opens many opportunities!
 */
public class Solution1 {
    public void javaRush(){
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");


        }

        public static void print(String s) {
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        }

    }
