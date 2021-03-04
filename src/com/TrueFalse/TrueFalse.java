package com.TrueFalse;

public class TrueFalse {
    public static void main(String[] args) {
        System.out.println(test( false, false, false, false));
        System.out.println(test(false, false, false, true));
        System.out.println(test(false, false, true, false));
        System.out.println(test(false, false, true, true));

        System.out.println(test(false, true, false, false));
        System.out.println(test(false, true, false, true));
        System.out.println(test(false, true, true, false));
        System.out.println(test(false, true, true, true));

        System.out.println(test(true, false, false, false));
        System.out.println(test(true, false, false, true));
        System.out.println(test(true, false, true, false));
        System.out.println(test(true, false, true, true));

        System.out.println(test(true, true, false, false));
        System.out.println(test(true, true, false, true));
        System.out.println(test(true, true, true, false));
        System.out.println(test(true, true, true, true));
    }

    public static boolean test(boolean a, boolean b, boolean c, boolean d){
        int count = 0;
        if (a) count++;
        if (b) count++;
        if (c) count++;
        if (d) count++;
        return count == 2;
    }
}
