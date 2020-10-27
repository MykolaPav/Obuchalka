package com.ZadachiJavaRush.Course_7;
import java.io.IOException;
import java.util.Scanner;
/*
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
 */
public class Solution1 {
    public void javaRush() throws IOException {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        int[] array = new int [20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <5; i++) {
            array[i]= sc.nextInt();
        }
        return array;
    }
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            while (array[i] > max)
                max = array[i];

        }
            return max;
    }
}

//public class Solution {
//    public static void main(String[] args) throws Exception {
//        int[] array = initializeArray();
//        int max = max(array);
//        System.out.println(max);
//    }
//
//    public static int[] initializeArray() throws IOException {
//        // создай и заполни массив
//        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//        int []array=new int[20];
//        for(int i =0;i<array.length;i++){
//            array[i]=Integer.parseInt(reader.readLine());
//        }
//        return array ;
//    }
//
//    public static int max(int[] array){
//        int max= array[0] ;
//        for(int i=0;i<array.length;i++){
//            if (array[i] >max) {
//                max=  array[i] ;
//            }
//
//
//        }
//        return max ;
//    }
//}