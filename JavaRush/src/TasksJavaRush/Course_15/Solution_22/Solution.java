package TasksJavaRush.Course_15.Solution_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. меньше либо равно нулю или больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
 */
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            String str = reader.readLine();
            if (str.equals("exit")) break;
            else try
            {
                if (str.contains(".") ) print(Double.parseDouble(str));
                else if (Integer.parseInt(str) <= 0 || Integer.parseInt(str) >= 128)
                         print(Integer.parseInt(str));
                else if (Integer.parseInt(str) >= 0 || Integer.parseInt(str) <= 128)
                         print(Short.parseShort(str));
            }catch (NumberFormatException e)
            {
                print(str);
            }
        }
    }

    public static void print(Double value)
    {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value)
    {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value)
    {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value)
    {
        System.out.println("Это тип Integer, значение " + value);
    }
}
