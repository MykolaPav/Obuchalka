package com.ZadachiJavaRush.AMain;

import java.io.IOException;
import java.util.Random;

/*

 */
public class TestJava {
    public void javaRush() throws IOException {
        Random random1 = new Random();

        double x = 5.999;
        double z =  x*2;
        System.out.println(z);
        

//        FileInputStream file = new FileInputStream("C:\\Users\\CMDR_\\OneDrive\\Рабочий стол\\Test\\File.txt");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(file, "UTF8"));
//        int i;
//        while ((i = reader.read()) != -1) {
//            System.out.print((char) i);
//        }

//        String str = "8";
//
//        for (int i = 0; i < 10; i++) {
//            int drow = 10 - i;
//
//            for (int j = 0; j < drow; j++) {
//                System.out.print(str);
//            }
//            System.out.println();
//        }


//        int[] li =  {10, 9, 8, 100, 6, 5, 4, 3, 2, 1};
//        Arrays.sort(li);
//        System.out.println(Arrays.toString(li));

//        int[][] doubleArray =  { {1,2,3,4,5}, {6,7,8,-100,10}, {11,12,13,14,15}, };
//
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 0; i < doubleArray.length; i++) {
//            System.out.println("");
//            for (int j = 0; j < doubleArray[i].length; j++) {
//               min = Math.min(min,doubleArray[i][j]);
//
//                System.out.println(min );
//            }
//        }
//        System.out.println(Math.min(Arrays.deepToString(doubleArray));
//        System.out.println(Arrays.deepToString(doubleArray));

//        int i;
//        String in= "C:\\Users\\CMDR_\\OneDrive\\Рабочий стол\\Test\\Input\\ArrayList.txt";
//        String out = "C:\\Users\\CMDR_\\OneDrive\\Рабочий стол\\Test\\Output\\NewArray3.txt";
//
//        try ( FileInputStream fin = new FileInputStream(in);
//            FileOutputStream fout = new FileOutputStream(out) )
//        {
//            do {
//                i = fin.read();
//                if (i != -1) fout.write(i);
//            } while( i != -1);
//
//        }catch (IOException e) {
//            System.out.println("Ошибка ввода - вывода");
//        }
    }
}
