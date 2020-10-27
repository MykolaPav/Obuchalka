package com.ZadachiJavaRush.Course_18.Solution_14;

import java.io.FileInputStream;

/*
Измени класс TxtInputStream так, чтобы он работал только с txt-файлами (*.txt).
Например, first.txt или name.1.part3.txt.
Если передан не txt-файл, например, file.txt.exe,
то конструктор должен выбрасывать исключение UnsupportedFileNameException.
Подумай, что еще нужно сделать, в случае выброшенного исключения.
*/
public class TxtInputStream extends FileInputStream {
    public TxtInputStream(String fileName) throws Throwable{
        super(fileName);
        if (!fileName.matches(".*\\.txt$")){
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void javaRush() throws Exception {
        //
    }

}
