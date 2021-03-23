package com.I_O.codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyCo {
//    private static final String GOOGLE_ALLATRA_GEORGIA = "Dobro2020GEO&Dobro2020GEO";
//    private static final String GOOGLE_MY_AKK = "Dobro2021LuboV&&Lubov2021doBro";
//    private static final String VK = "";
//    private static final String FACEBOOK = "LuboV&2021Dobro&BlagoDARnost";
//    final String all = GOOGLE_ALLATRA_GEORGIA + GOOGLE_MY_AKK + VK + FACEBOOK;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        while (a != 0) {
            nums.add(a % 10);
            a /= 10;
        }

        Object arr[] = new Object[10];
        boolean empty = true;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != null) {
                empty = false;
                break;
            }
        }
        System.out.println(nums.size());
//        long ac = sc.nextInt();
//        System.out.println((a + "").length());
    }

}
