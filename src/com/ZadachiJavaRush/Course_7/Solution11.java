package com.ZadachiJavaRush.Course_7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
 */
public class Solution11 {
    public void javaRush() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }
        for (int i = 0; i <= 13; i++) {
            list.get(list.size()-1);
            list.remove(5);
            list.add(0,sc.nextLine());
        }
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println( list.get(i));
        }
    }
}

//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> list = new ArrayList<>();
//
//        for (int i = 0; i < 5; i++){     // заполняем список
//            String s = reader.readLine();
//            list.add(s);
//        }
//        for ( int i = 1; i <= 13; i++){
//            String s = list.get(list.size()-1);
//            list.remove(s);
//            list.add(0, s);
//        }
//        for (int i = 0; i < list.size(); i++)
//        {
//            System.out.println( list.get(i));
//        }
//
//    }
//}