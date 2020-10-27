package com.ZadachiJavaRush.Course_7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка,
и выведи оставшиеся элементы в обратном порядке.
 */
public class Solution14 {
    public void javaRush() throws IOException {
        ArrayList<String> list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(0,sc.nextLine());
        }
        list.remove(2);
        for (String i : list) {
            System.out.println(i);
        }
    }
}

//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> list=new ArrayList<>();
//        for(int i=0; i++ < 5; list.add(0,reader.readLine() ) ){
//        }
//        list.remove(2);
//        for(String s:list)
//            System.out.println(s);
//    }
//}