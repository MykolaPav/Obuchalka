package TasksJavaRush.AMain;

import java.io.FileOutputStream;
import java.util.ArrayList;

public class WriteToFile {
//"C:\Users\CMDR_\OneDrive\Рабочий стол\Test\File.txt"
//"C:\\Users\\CMDR_\\OneDrive\\Рабочий стол\\Test\\File.txt"

    public void javaRush() throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mama");
        list.add("Mila");
        list.add("Ramu");

        FileOutputStream fio = new FileOutputStream("C:\\Users\\CMDR_\\OneDrive\\Рабочий стол\\Test\\File.txt");
        //
    }
}
