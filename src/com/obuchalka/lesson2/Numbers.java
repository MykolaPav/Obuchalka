package com.obuchalka.lesson2;

public class Numbers {
    static byte  a = 126;                      //2^8 = 256  _________________________(от -128 до 128)
    static short b = 777;                      //2^16 = 65_538  _____________________(от -32768 до 32767)
    static int   c = 35_000;                   //2^32 = 4_294_967_296  ______________(от -2_147_483_648 до 2_147_483_647)
    static long  d = 1_000_000_000_000_000L;   //2^64 = 18_446_744_073_709_551_616 __(от -9_223_372_036_854_775_808 до 9_223_372_036_854_775_807)

    static char  e = 'c';                      //2^16 = 65_538  _____________________(от 0 до 65_537) Кодировка Unicode

    static float   f = 7.1F;                   //2^32  ______________________________(от ~-1,4*10^45 до ~3,4*10^38)
    static double  g = 6.3;                    //2^64  ______________________________(от ~-4,9*10-324 до ~1,8*10^308)

    static boolean h = true;                   //8  bit (в массивах), и 32 bit (не в массивах)

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
