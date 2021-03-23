package TasksJavaRush.Course_20.Solution_25_;

import java.util.Arrays;

/**
 * Число S состоит из M цифр, например, S=370 и M (количество цифр) = 3
 * Реализовать логику метода getNumbers, который должен среди натуральных чисел меньше N (long)
 * находить все числа, удовлетворяющие следующему критерию:
 * число S равно сумме его цифр, возведенных в M степень
 * getNumbers должен возвращать все такие числа в порядке возрастания.
 *
 * Пример искомого числа:
 * 370 = 3*3*3 + 7*7*7 + 0*0*0
 * 8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8
 *
 * На выполнение дается 10 секунд и 50 МБ памяти.
 * Метод main не участвует в тестировании.
 */
/*
Алгоритмы-числа
*/
public class Solution
{

    public static long[] getNumbers(long N)
    {
        long[] result = null;
        return result;
    }

    public void javaRush()
    {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() -
                                        Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() -
                                        Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}

