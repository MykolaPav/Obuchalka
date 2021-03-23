package com.test;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception  {
        Test test = new Test();
      //  try ( FileInputStream fis =
        try ( InputStreamReader fis =
                     // new FileInputStream("C:\\Users\\CMDR_\\OneDrive\\Рабочий стол\\Коды\\Java\\InputStream OutputStream\\file.txt");
                      new InputStreamReader(System.in);
              FileOutputStream fos =
                      new FileOutputStream("C:\\Users\\CMDR_\\OneDrive\\Рабочий стол\\Коды\\Java\\InputStream OutputStream\\file3.txt"))
        {
            test.copy(fis, fos);
        }
//        try ( FileInputStream fis =
//                      new FileInputStream("C:\\file2.txt");
//              FileOutputStream fos =
//                      new FileOutputStream("C:\\file4.txt"))
//        {
//            test.copy(fis, fos);
//        }

    }
    private void copy(InputStreamReader in, FileOutputStream out) throws IOException {
        while (true) {
            int read = in.read();
            if (read > 0) {
                 out.write(read);
            }else if (read == -1) break;
        }
    }
}

