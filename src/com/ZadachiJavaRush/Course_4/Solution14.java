package com.ZadachiJavaRush.Course_4;

import java.util.Scanner;

/*
Ввести с клавиатуры год, определить количество дней в году.
Результат вывести на экран в следующем виде:
количество дней в году: x
, где
х - 366 для високосного года,
х - 365 для обычного года.
Подсказка:
В високосном году - 366 дней, тогда как в обычном - 365.
1) если год делится без остатка на 400 это високосный год;
2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
4) все оставшиеся года невисокосные.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 - не високосные.
 */
public class Solution14 {
    public void javaRush() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
//        System.out.println("количество дней в году: " + (i%4==0  ? i%100==0 ? i%400==0 ? "366" : "365" : "366" : "365") );

        int a = 365, b = 366;
        if (i %4==0)
            System.out.println("количество дней в году: " + b);
        else if(i % 100==0)
            System.out.println("количество дней в году: " + a);
        else if(i % 400==0)
            System.out.println("количество дней в году: " + b);
        else
            System.out.println("количество дней в году: " + a);
    }
}