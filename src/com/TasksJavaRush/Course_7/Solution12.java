package com.TasksJavaRush.Course_7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
 */
public class Solution12 {
    public void javaRush() throws IOException {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //String s;
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextLine());
            if (list.get(i).length() > max)
                max = list.get(i).length();
            if (list.get(i).length() < min)
                min = list.get(i).length();

        }       // ВЫВОД НА ЭКРАН САМОГО ПЕРВОГО СЛОВА КОТОРОЕ ЗАДАНО В УСЛОВИИ
        for(int i = 0; i < 10; i++){
            if (max == list.get(i).length()){
                System.out.println(list.get(i));
                break;
            }
            else if (min == list.get(i).length()){
                System.out.println(list.get(i));
                break;
            }
        }
//        for (String s : list) {
//            if (max == s.length()) {
//                System.out.println(s);
//                break;
//            }
//            else if (min == s.length()){
//                System.out.println(s);
//                break;
//            }
//        }
    }
}
