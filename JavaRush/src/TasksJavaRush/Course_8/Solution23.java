package TasksJavaRush.Course_8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
 */
public class Solution23 {
    public void javaRush() throws IOException {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }
    public static int getMinimum(List<Integer> array) {
        return Collections.min(array);
    }


    public static List<Integer> getIntegerList() throws IOException {

        List<Integer> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }

        return array;
    }
}
