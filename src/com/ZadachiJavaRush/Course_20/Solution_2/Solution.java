//package com.ZadachiJavaRush.Course_20.Solution_2;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Реализуйте логику записи в файл и чтения из файла для класса JavaRush.
// * Метод main реализован только для вас и не участвует в тестировании.
// */
//public class Solution {
//    public void javaRush(){
//        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
//        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
//        try {
//            File yourFile = File.createTempFile("your_file_name", null);
//            OutputStream outputStream = new FileOutputStream(yourFile);
//            InputStream inputStream = new FileInputStream(yourFile);
//
//            JavaRush javaRush = new JavaRush();
//            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
//            javaRush.save(outputStream);
//            outputStream.flush();
//
//            JavaRush loadedObject = new JavaRush();
//            loadedObject.load(inputStream);
//            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
//
//            outputStream.close();
//            inputStream.close();
//
//        } catch (IOException e) {
//            //e.printStackTrace();
//            System.out.println("Oops, something is wrong with my file");
//        } catch (Exception e) {
//            //e.printStackTrace();
//            System.out.println("Oops, something is wrong with the save/load method");
//        }
//    }
//
//    public static class JavaRush {
//        public List<User> users = new ArrayList<>();
//
//        public void save(OutputStream outputStream) throws Exception {
//            //implement this method - реализуйте этот метод
//        }
//
//        public void load(InputStream inputStream) throws Exception {
//            //implement this method - реализуйте этот метод
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//
//            JavaRush javaRush = (JavaRush) o;
//
//            return users != null ? users.equals(javaRush.users) : javaRush.users == null;
//
//        }
//
//        @Override
//        public int hashCode() {
//            return users != null ? users.hashCode() : 0;
//        }
//    }
//}
