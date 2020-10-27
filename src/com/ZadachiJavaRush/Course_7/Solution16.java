package com.ZadachiJavaRush.Course_7;
import java.io.IOException;
import java.util.ArrayList;
/*
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
 */
public class Solution16 {
    public void javaRush() throws IOException {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }
    public static ArrayList<String> fix(ArrayList<String> strings) {
        for(int i = 0; i < strings.size(); ){
            if(strings.get(i).contains("р") && strings.get(i).contains("л")){
                i ++;
            }
            else if(strings.get(i).contains("л")){
                strings.add(i, strings.get(i));
                i += 2;
            }
            else if(strings.get(i).contains("р")){
                strings.remove(i);
            }
            else i ++;
        }
        return strings;
    }
}
