package com.I_O.Fis_Fos;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExampleFileOutputStream {
    public static void main(String[] args) throws Exception {
        //создаем объект FileInputStream, привязанный к файлу «c:/file.txt».
        FileInputStream fis = new FileInputStream("C:\\Users\\CMDR_\\OneDrive\\Рабочий стол\\Коды\\Java\\InputStream OutputStream\\file.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream fos = new FileOutputStream("C:\\Users\\CMDR_\\OneDrive\\Рабочий стол\\Коды\\Java\\InputStream OutputStream\\file2.txt");

        while (fis.available() > 0) {  //пока есть еще непрочитанные байты
            int data = fis.read();    // прочитать очередной байт в переменную data
            fos.write(data);         // и записать его во второй поток
        }
        fis.close();               //закрываем оба потока. Они больше не нужны.
        fos.close();
    }
}
