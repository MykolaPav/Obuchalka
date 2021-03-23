package com.I_O.Fis_Fos;

import java.io.FileInputStream;

public class ExampleFileInputStream {
    public static void main(String[] args) throws Exception {
        //создаем объект FileInputStream, привязанный к файлу «c:/file.txt».
        FileInputStream fis = new FileInputStream("C:\\Users\\CMDR_\\OneDrive\\Рабочий стол\\Коды\\Java\\InputStream OutputStream\\file.txt");
        long sum = 0;

        while (fis.available() > 0) {  //пока остались непрочитанные байты
            int data = fis.read();    //прочитать очередной байт
            sum += data;             //добавить его к общей сумме
        }
        fis.close();               // закрываем поток
        System.out.println(sum);  //выводим сумму на экран.
    }
}
