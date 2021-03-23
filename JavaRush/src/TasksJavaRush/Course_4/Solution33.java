package TasksJavaRush.Course_4;
import java.io.IOException;
/*
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
 */
public class Solution33 {
    public void javaRush() throws IOException {
        String i = "SSSSSSSSSS";
        int a = 1;
        int b = 10;
        while (a <= 10) {
            System.out.println(i);
            a++;
        }
    }
}
