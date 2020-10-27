package com.ZadachiJavaRush.Course_19.Solution_;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *  *  Исправить ошибку. Классы и интерфейсы
 *  *  Программа содержит всего 1 логическую ошибку.
 *  *  Найди и исправь ее.
 */
public class Solution {
    {
        System.out.println("This is the Solution class");
    }

    public static void main(String... args) throws IOException {
        try (
                FileOutputStream outputStream = new FileOutputStream(args[0]);
                InputStream is = Solution.class.getClassLoader().getResourceAsStream(args[1]);
        ) {

            byte[] b = new byte[is.available()];
            outputStream.write(is.read(b));

            Example result = null;
            String s = "a";
            switch (s) {
                case "a": {
                    result = new Solution().new A();
                    break;
                }
                case "b": {
                    result = new Solution().new B();
                    break;
                }
                case "c": {
                    result = new Solution().new C();
                    break;
                }
            }

            if (result instanceof C) {
                C p = (C) result;
                System.out.println(p.getClass().getSimpleName());
            }

        } catch (IOException e) {
        }
    }

    interface Example {
    }

    class A implements Example {
        {
            System.out.println("This is the A class");
        }
    }

     class B implements Example {
        {
            System.out.println("This is the B class");
        }
    }

     class C extends A {
        {
            System.out.println("This is the C class");
        }
    }
}

