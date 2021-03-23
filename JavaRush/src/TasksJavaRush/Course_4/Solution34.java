package TasksJavaRush.Course_4;
import java.io.IOException;
/*
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
 */
public class Solution34 {
    public void javaRush() throws IOException {
        int i = 1, j = 1;
        while (i != 11) {
            while (j != 11) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            i++;
            j = 1;
        }
    }
}
