package com.ZadachiJavaRush.Course_16;

/*
1. Разберись, что делает программа.
2. В статическом блоке считай 2 имени файла firstFileName и secondFileName.
3. Внутри класса Solution создай нить public static ReadFileThread, которая реализует
интерфейс ReadFileInterface (Подумай, что больше подходит - Thread или Runnable).
3.1. Метод setFileName должен устанавливать имя файла, из которого будет читаться содержимое.
3.2. Метод getFileContent должен возвращать содержимое файла.
3.3. В методе run считай содержимое файла, закрой поток. Раздели пробелом строки файла.
4. Подумай, в каком месте нужно подождать окончания работы нити, чтобы обеспечить последовательный вывод файлов.
4.1. Для этого добавь вызов соответствующего метода.

Ожидаемый вывод:
[все тело первого файла]
[все тело второго файла]
 */
//public class Solution_30 {
//    public static String firstFileName;
//    public static String secondFileName;
//
//    //add your code here - добавьте код тут
//    public void javaRush() throws Exception {
//        systemOutPrintln(firstFileName);
//        systemOutPrintln(secondFileName);
//    }
//
//    public static void systemOutPrintln(String fileName) throws InterruptedException {
//        ReadFileInterface f = new ReadFileThread();
//        f.setFileName(fileName);
//        f.start();
//        //add your code here - добавьте код тут
//        System.out.println(f.getFileContent());
//    }
//
//    public interface ReadFileInterface {
//
//        void setFileName(String fullFileName);
//
//        String getFileContent();
//
//        void join() throws InterruptedException;
//
//        void start();
//    }
//
//    //add your code here - добавьте код тут
//    public static class ReadFileThread extends Thread implements ReadFileInterface {
//        @Override
//        public void setFileName(String fullFileName) {
//
//        }
//        @Override
//        public String getFileContent() {
//            return null;
//        }
//
//        @Override
//        public void run() {
//            //
//        }
//    }
//}

