package TasksJavaRush.Course_10;

import java.util.ArrayList;
import java.util.Arrays;

/*
Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.
 */
public class Solution15 {
    public void javaRush() {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] list = new ArrayList[4];
        list[0]= new ArrayList(Arrays.asList("Cat1"));
        list[1]= new ArrayList(Arrays.asList("Cat2"));
        list[2]= new ArrayList(Arrays.asList("Cat3"));
        list[3]= new ArrayList(Arrays.asList("Cat4"));
        return  list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
