package TasksJavaRush.Course_3;
import java.io.*;

/*
Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!
Пример:
Вася захватит мир через 8 лет. Му-ха-ха!
Последовательность вводимых данных имеет большое значение.
 */
public class Solution18 {
    public void javaRush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);


        System.out.println(name + " захватит мир через " + sAge + " лет. Му-ха-ха!");
    }
}
