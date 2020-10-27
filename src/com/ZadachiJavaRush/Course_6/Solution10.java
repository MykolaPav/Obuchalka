package com.ZadachiJavaRush.Course_6;
import java.io.IOException;

/*
Сделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) - возвращает строку повторенную count раз.
String multiply(String s) - возвращает строку повторенную 5 раз.
Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
 */
public class Solution10 {
    public static class StringHelper {
        public static String multiply(String s) {
            String result = "";
            for (int i = 0; i < 5; i++) {
                result = result + s;
                System.out.println(s);
            }
            return result;
        }

        public static String multiply(String s, int count) {
            String result = "";
            for (int i = 0; i < count; i++) {
                result = result + s;
                System.out.println(s);
            }
            return result;
        }

    }
    public void javaRush() throws IOException {
        //
    }
}



//public class StringHelper {
//    public static String multiply(String s) {
//        String result = "";
//        //напишите тут ваш код
//        for (int i=0;i<5;i++){
//            result = result + s;
//            System.out.print(s);
//        }
//        return result;
//    }
//
//    public static String multiply(String s, int count) {
//        String result = "";
//        //напишите тут ваш код
//        for (int i=0;i<count;i++){
//            result = result + s;
//            System.out.print(s);
//
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}