package TasksJavaRush.Course_9;

import java.io.IOException;
import java.util.Scanner;

/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м .
 */
public class Solution23 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public void javaRush() throws IOException {
        Scanner sc = new Scanner(System.in);
        String console = sc.nextLine();


        for (int i = 0; i < console.length(); i++) {
            if (console.charAt(i) != ' ') {
                char x = console.charAt(i);
                {
                    if (isVowel(x) == true)
                        System.out.print(x + " ");
                }
            }
        }System.out.println();

        for (int i = 0; i < console.length(); i++) {
            if (console.charAt(i) != ' ') {
                char x = console.charAt(i);
                {
                    if (isVowel(x) == false)
                        System.out.print(x + " ");
                }
            }
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
