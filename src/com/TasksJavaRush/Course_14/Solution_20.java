package com.TasksJavaRush.Course_14;

import java.math.BigInteger;
import java.util.Scanner;

/*
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
 */
public class Solution_20 {
    public void javaRush() throws Exception {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        //sc.close();
        int bX = Integer.parseInt(x);
        int bY = Integer.parseInt(y);
        if (bX <= 0) {
            throw new Exception();
        }
        if (bY <= 0) {
            throw new Exception();
        }
        BigInteger bgi1, bgi2, bigVal;
        bgi1 = new BigInteger(x);
        bgi2 = new BigInteger(y);
        bigVal = bgi1.gcd(bgi2);
        System.out.println(bigVal);
    }
}
