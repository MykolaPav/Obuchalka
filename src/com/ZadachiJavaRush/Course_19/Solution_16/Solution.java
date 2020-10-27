//package com.ZadachiJavaRush.Course_19.Solution_16;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Считать с консоли 2 имени файла - file1, file2.
// * Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
// * Нужно создать объединенную версию строк, записать их в список lines.
// * Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME.
// * Пустые строки даны в примере для наглядности.
// * В оригинальном и редактируемом файлах пустых строк нет!
// *
// * Пример 1:
// * оригинальный    редактированный    общий
// * file1:          file2:             результат:(lines)
// *
// * строка1         строка1            SAME строка1
// * строка2                            REMOVED строка2
// * строка3         строка3            SAME строка3
// * строка4                            REMOVED строка4
// * строка5         строка5            SAME строка5
// *                 строка0            ADDED строка0
// * строка1         строка1            SAME строка1
// * строка2                            REMOVED строка2
// * строка3         строка3            SAME строка3
// *                 строка4            ADDED строка4
// * строка5         строка5            SAME строка5
// * строка0                            REMOVED строка0
// *
// * Пример 2:
// * оригинальный    редактированный    общий
// * file1:          file2:             результат:(lines)
// *
// * строка1         строка1            SAME строка1
// *                 строка0            ADDED строка0
// *
// * Пустые строки в примере означают, что этой строки нет в определенном файле.
// */
//public class Solution {
//    public static List<LineItem> lines = new ArrayList<LineItem>();
//    public void javaRush() {
//        //
//    }
//    public static enum Type {
//        ADDED,        //добавлена новая строка
//        REMOVED,      //удалена строка
//        SAME          //без изменений
//    }
//
//    public static class LineItem {
//        public Type type;
//        public String line;
//
//        public LineItem(Type type, String line) {
//            this.type = type;
//            this.line = line;
//        }
//    }
//}
