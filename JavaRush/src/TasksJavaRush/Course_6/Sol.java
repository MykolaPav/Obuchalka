package TasksJavaRush.Course_6;

import java.io.IOException;
import java.util.Scanner;

public class Sol
{
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 0;
        while (a > 0)
        {
            c = a % 10;
            a = a / 10;
            if (c % 2 == 0) even++;
            if (c % 2 != 0) odd++;
        }
        System.out.println("Even:" + " " + even + " " + "Odd:" + " " + odd);
    }
}
