package TasksJavaRush.Course_17.Solution_21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла.
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines.
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines.
4. Если условие из п.3 не выполнено, то:
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
Не забудь закрыть потоки.
 */
public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> forRemoveLines = new ArrayList<>();

    public static void javaRush() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();
        try(BufferedReader readFile = new BufferedReader(new InputStreamReader(new FileInputStream(fileOne)))) {
            while (readFile.ready())  {
                allLines.add(readFile.readLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        try(BufferedReader readFile = new BufferedReader(new InputStreamReader(new FileInputStream(fileTwo)))) {
            while (readFile.ready())  {
                forRemoveLines.add(readFile.readLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        Solution solution = new Solution();
        solution.joinData();
        reader.close();
    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
