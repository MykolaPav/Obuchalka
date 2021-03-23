package TasksJavaRush.Course_10;

import java.util.*;

/*
Ввести с клавиатуры в список 20 слов.
Нужно подсчитать сколько раз каждое слово встречается в списке.
Результат нужно представить в виде словаря Map<String, Integer>,
где первый параметр - уникальное слово, а второй - число, сколько раз данное слово встречалось в списке.

Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
 */
public class Solution16 {
    public void javaRush()  {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            words.add(sc.nextLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        //напишите тут ваш код
        HashMap<String, Integer> result = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int freqency = Collections.frequency(list, list.get(i));
                result.put(list.get(i), freqency);
        }
        return result;
    }
}
