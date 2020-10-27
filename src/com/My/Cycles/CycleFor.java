package com.My.Cycles;

import java.io.IOException;
import java.util.Scanner;

public class CycleFor {
    public void javaRush() throws IOException {
        // Цыкл работает пока оператор не введёт слово stop
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for (int i = 0; !((String) sc.nextLine()).equals("stop"); i++) {
            System.out.println("Буква " + sc.nextLine());
        }
        //
        //
        //
        //
        //
        //

    }
}
