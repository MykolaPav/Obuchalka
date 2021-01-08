package com.My.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTest
{
    public static void main(String[] args) throws IOException
    {
        SplitExamples spe = new SplitExamples();
//        spe.splitString(readerString());
//        System.out.println(spe.splitStringEmail(readerString()));

        System.out.println(spe.splitDouble(readerString()));

    }


    public static String readerString() throws IOException
    {   // Считывает строку из консоли и возвращает результат.
        String str;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            str  = reader.readLine();
        }
        return str;
    }
}
