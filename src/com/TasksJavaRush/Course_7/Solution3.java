package com.TasksJavaRush.Course_7;
import java.io.IOException;
import java.util.Scanner;

/*
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
 */
public class Solution3 {
    public void javaRush() throws IOException {
        int[] a = new int[3];
        String[] b = new String[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <3; i++) {
            b[i] = sc.nextLine();
        }
        for(int i = 0; i<a.length; i++){
            a[i] = b[i].length();
        }
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        for(int i = a.length -1; i>=0; i--){
            System.out.println(a[i]);
        }
    }
}

//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String[] in1 = new String[10];
//        int[] in2 = new int[10];
//        for (int i = 0; i < in1.length; i++) {
//            in1[i] = in.readLine();
//        }
//        for(int i = 0; i<in2.length; i++){
//            in2[i] = in1[i].length();
//        }
//        for(int i = 0; i<in2.length; i++){
//            System.out.println(in2[i]);
//        }
//    }
//}