package com.My.String;

public class LengthOfString
{
    public static LengthOfString l = new LengthOfString();
    public String s = "Good news everyone";
    int n;
    public static void main(String[] args)
    {

        //Длина строки

        System.out.println(l.length());
        System.out.println(l.length_2());
    }

    public int length()
    {
        //Внутренний метод класса String возвращает длину строки
      return n = s.length();
    }

    public int length_2()
    {
        int x = 0;
        for (int i = 0; i < s.length(); i++)
        {
            x++;
        }
        return x;
    }
}
