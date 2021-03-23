package TasksJavaRush.Course_4;
import java.util.*;
/*
Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.
 */
public class Solution12 {
    public void javaRush() throws Exception{
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println(a*2);
        }
        else if (a < 0){
            System.out.println(a+1);
        }
        else if (a==0){
            System.out.println(a);
        }

    }
}
