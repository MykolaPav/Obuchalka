package TasksJavaRush.Course_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв
(для 33 маленьких букв алфавита). Результат вывести на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9
 */
public class Solution12 {
    public void javaRush() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        String longString = "";

        for(int i = 0; i < list.size(); i++) //цикл  создания одной большой строки
        {
            longString += list.get(i);
        }

        char[] simbols =  longString.toCharArray();// перевод строки в массив символов

        //цикл который идет по всей длине строки и сравнивает символы между массивом и листом м alphabet,
        // еси символы равны счетчик ++ и добавляем число в лист

        List<Integer> chisla = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < alphabet.size();i++)
        {
            for(int j = 0; j < simbols.length ;j++)
            {
                if(alphabet.get(i) == (simbols[j]))
                {
                    count++;
                }
            }
            chisla.add(count);
            count = 0;
        }

        //выаод на экран
        for(int i = 0; i < alphabet.size() ; i++)
        {
            System.out.println(alphabet.get(i) + " " + chisla.get(i));
        }
    }
}
