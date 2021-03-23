package TasksJavaRush.Course_4;
import java.io.IOException;
import java.util.Scanner;

/*
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
-"отрицательное четное число" - если число отрицательное и четное,
-"отрицательное нечетное число" - если число отрицательное и нечетное,
"ноль" - если число равно 0,
-"положительное четное число" - если число положительное и четное,
-"положительное нечетное число" - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
 */
public class Solution26 {
    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0 && a  > 0)
            System.out.println("положительное четное число");

        else if (a % 2 != 0 && a > 0)
            System.out.println("положительное не четное число");

        else if (a % 2 == 0 && a  < 0)
            System.out.println("отрицательное четное число");

        else if (a % 2 != 0 && a  < 0)
            System.out.println("отрицательное не четное число");

        else if (a == 0)
            System.out.println("Ноль");


//        String evenOdd = (a%2==0) ? "четное число" : "нечетное число";
//        String positiveNegative = (a > 0) ? "положительное" : "отрицательное";
//
//        if (a == 0)
//            System.out.println("ноль");
//        else
//            System.out.println(positiveNegative + " " + evenOdd);
    }
}
