package TasksJavaRush.Course_7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке. Каждый элемент - с новой строки.
Использовать только цикл for.

Подсказка:
Не забудь импортировать класс: java.util.ArrayList;
 */
public class Solution19 {
    public void javaRush() throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        for (int i = list.size() -1; i >= 0 ; i--)
            System.out.println(list.get(i));
    }
}


//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
//
//        for (int i = 0; i < 10; i++){
//            String s = reader.readLine();
//            list.add(Integer.parseInt(s));
//        }
//
//        for (int i = list.size() - 1; i >= 0; i--){
//            System.out.println(list.get(i));
//        }
//
//    }
//}