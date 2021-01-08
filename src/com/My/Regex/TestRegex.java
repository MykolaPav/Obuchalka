package com.My.Regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestRegex {
    static String st;
    static String str = "Кто в любви тот в Боге и Бог в нём, ибо Бог и есть сама любовь.";
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            st = reader.readLine();

            RegexExamples testR = new RegexExamples();
            System.out.print("Check Email is = ");
            System.out.println(testR.regexCheckEmail(st));
            
        }
    }
}
