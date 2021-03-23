package TasksJavaRush.Course_7;
import java.io.IOException;
import java.util.Scanner;

/*
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
 */
public class Solution2 {
    public void javaRush() throws IOException {
        //
        String[] str = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <8; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = str.length -1; i >= 0; i--) {
            System.out.println(str[i]);
        }
    }
}


//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        String mass[] = new String [10];
//        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//        for (int i = 0; i < 8; i++) {
//            mass[i] = reader.readLine();
//        }
//        for (int i = mass.length -1; i >= 0 ; i--) {
//            System.out.println(mass[i]);
//
//        }
//    }
//}