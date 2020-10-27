package com.ZadachiJavaRush.Course_19.Solution_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *Адаптировать Scanner к PersonScanner.
 * Классом-адаптером является PersonScannerAdapter.
 * В классе адаптере создать приватное финальное поле Scanner fileScanner.
 * Поле инициализировать в конструкторе с одним аргументом типа Scanner.
 *
 * Данные в файле хранятся в следующем виде:
 * Иванов Иван Иванович 31 12 1950
 * Петров Петр Петрович 31 12 1957
 *
 * В файле хранится большое количество людей, данные одного человека находятся в одной строке.
 * Метод read() должен читать данные только одного человека.
 */
public class Solution {
    public static void javaRush() {
        //
    }
    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() {
            String line = fileScanner.nextLine();
            String[]arr = line.split("\\s",4);
            SimpleDateFormat  dateFormat = new SimpleDateFormat("d M y", Locale.ENGLISH);
            String d = arr[3];
            Date date = null;
            try {
                date = dateFormat.parse(d);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new Person(arr[1],arr[2],arr[0],date);
        }

        @Override
        public void close() {
            fileScanner.close();
        }
    }
}
