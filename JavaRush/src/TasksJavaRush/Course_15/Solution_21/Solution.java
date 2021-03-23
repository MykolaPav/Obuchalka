package TasksJavaRush.Course_15.Solution_21;

import java.math.BigInteger;
import java.util.Scanner;

/*
Написать метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа включая его.

Пример вычислений: 4! = factorial(4) = 1*2*3*4
Пример вывода: 24

1. Ввести с консоли число меньше либо равно 150.
2. Реализовать функцию factorial.
3. Если введенное число меньше 0, то вывести 0.
0! = 1
 */
public class Solution {
    public void javaRush() throws Exception {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();

        System.out.println(factorial(Integer.parseInt(n)));
    }

    public static String factorial(int n) {
        if (n < 0){
            return String.valueOf(BigInteger.valueOf(0));
        }if (n == 0){
            return String.valueOf(BigInteger.valueOf(1));
        }
        else {
            BigInteger res = BigInteger.valueOf(1);
            for (int i = 2; i <= n; i++) {
                res = res.multiply(BigInteger.valueOf(i));
            }
            return String.valueOf(res);
        }
    }
}
