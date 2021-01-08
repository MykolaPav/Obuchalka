package com.TasksJavaRush.Course_6;
import java.io.IOException;

/*
Создать статическую переменную int catCount в классе Cat.
Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.
 */
public class Solution6 {
    public static class Cat {
        int catCount = 0;
        public Cat(){
            catCount++;
        }
    }
    public void javaRush() throws IOException {
        //
    }
}




//
//public class Cat {
//    //напишите тут ваш код
//    static int catCount = 0 ;
//    public Cat()
//    {
//        catCount++;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}