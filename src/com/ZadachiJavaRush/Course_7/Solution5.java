package com.ZadachiJavaRush.Course_7;

import java.io.IOException;
import java.util.Scanner;

/*
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
 */
public class Solution5 {
    public void javaRush() throws IOException {
        int[] a1 = new int[20];
        int[] b2 = new int[10];
        int[] c3 = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++)
            a1[i] = sc.nextInt();


        for (int i = 0; i < 10; i++) {
            b2[i] = a1[i];
        }
        for (int i = 0; i < 10; i++) {
            c3[i] = a1[i + 10];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(c3[i]);
        }
    }
}

//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int[] big = new int[20];
//        int[] little1 = new int[10];
//        int[] little2 = new int[10];
//        for (int i = 0; i < 20; i++)
//            big[i] = Integer.parseInt(reader.readLine());
//        for (int i = 0; i < 10; i++){
//            little1[i] = big[i];
//        }
//        for (int i = 0; i < 10; i++){
//            little2[i] = big[i + 10];
//        }
//        for (int i = 0; i < 10; i++){
//            System.out.println(little2[i]);
//        }
//    }
//}

