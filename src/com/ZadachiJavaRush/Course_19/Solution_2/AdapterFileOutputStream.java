package com.ZadachiJavaRush.Course_19.Solution_2;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Используй класс AdapterFileOutputStream,
 * чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter.
 */
public class AdapterFileOutputStream implements AmigoStringWriter {
    private FileOutputStream fio;

    public static void javaRush() {
        //
    }

    public AdapterFileOutputStream(FileOutputStream fio) {
        this.fio = fio;
    }

    @Override
    public void flush() throws IOException {
        fio.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        fio.write(s.getBytes());
    }

    @Override
    public void close() throws IOException {
        fio.close();
    }
}
