package com.TasksJavaRush.Course_7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
 */
public class Solution22 {
    public void javaRush() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


            for (;;) {
                String s = sc.nextLine();
                if (s.equals("end")) break;
               else
                list.add(s);
            }



//        for (int i = 0;i < i +1;i ++) {
//            list.add(sc.nextLine());
//            if (list.get(i).equals("end"))break;
//        }
//        for (int i = 0;i < list.size();i ++){
//            System.out.println(list.get(i));}
////        list.remove(list.size() -1);
        for (int i = list.size()-1; i >=0; i--) {
            System.out.println(list.get(i));
        }
    }
}
