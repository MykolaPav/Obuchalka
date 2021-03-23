package TasksJavaRush.Course_15.Solution_28;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
1. Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.
 */
public class Solution {
    public static List<String> lines = new ArrayList<>();
    static {
        Scanner sc = null;
        try {
            sc = new Scanner(new File(Statics.FILE_NAME));
            while (sc.hasNextLine()){
                lines.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void javaRush() throws Exception {
        System.out.println(lines);
    }
}
