package com.ZadachiJavaRush.Course_20.Solution_19;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * После десериализации объекта класса Solution обнаружили, что данных в словаре [m] нет :(
 *
 * Исправить 1 ошибку.
 */
public class Solution implements Serializable {

    public void javaRush() throws Exception {
        FileOutputStream fileOutput = new FileOutputStream("your.file.name");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);

        Solution solution = new Solution();
        outputStream.writeObject(solution);

        fileOutput.close();
        outputStream.close();

        //load
        FileInputStream fiStream = new FileInputStream("your.file.name");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);

        Solution loadedObject = (Solution) objectStream.readObject();

        fiStream.close();
        objectStream.close();

        //Attention!!
        System.out.println(loadedObject.size());
    }

    private Map<String, String> m = new HashMap<>();

    public Map<String, String> getMap() {
        return m;
    }

//    public  Solution() {
//        m.put("Mickey", "Mouse");
//        m.put("Mickey", "Mantle");
//    }

    public int size() {
        return m.size();
    }
}
