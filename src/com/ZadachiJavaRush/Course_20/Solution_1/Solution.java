//package com.ZadachiJavaRush.Course_20.Solution_1;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * Реализуй логику записи в файл и чтения из файла для класса Human.
// * Поле name в классе Human не может быть пустым.
// * Метод main реализован только для вас и не участвует в тестировании.
// */
//public class Solution {
//    public void javaRush() {
//        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
//        try {
//            File your_file_name = File.createTempFile("your_file_name", null);
//            OutputStream outputStream = new FileOutputStream(your_file_name);
//            InputStream inputStream = new FileInputStream(your_file_name);
//
//            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
//            ivanov.save(outputStream);
//            outputStream.flush();
//
//            Human somePerson = new Human();
//            somePerson.load(inputStream);
//            inputStream.close();
//            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
//
//        } catch (IOException e) {
//            //e.printStackTrace();
//            System.out.println("Oops, something wrong with my file");
//        } catch (Exception e) {
//            //e.printStackTrace();
//            System.out.println("Oops, something wrong with save/load method");
//        }
//    }
//
//    public static class Human {
//        public String name;
//        public List<Asset> assets = new ArrayList<>();
//
//        public Human() {
//        }
//
//        public Human(String name, Asset... assets) {
//            this.name = name;
//            if (assets != null) {
//                this.assets.addAll(Arrays.asList(assets));
//            }
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//
//            Human human = (Human) o;
//
//            if (name != null ? !name.equals(human.name) : human.name != null) return false;
//            return assets != null ? assets.equals(human.assets) : human.assets == null;
//        }
//
//        @Override
//        public int hashCode() {
//            int result = name != null ? name.hashCode() : 0;
//            result = 31 * result + (assets != null ? assets.hashCode() : 0);
//            return result;
//        }
//
//        public void save(OutputStream outputStream) throws Exception {
//            //implement this method - реализуйте этот метод
//            PrintWriter prW = new PrintWriter(outputStream);
//
//        }
//
//        public void load(InputStream inputStream) throws Exception {
//            //implement this method - реализуйте этот метод
//        }
//    }
//}
//
