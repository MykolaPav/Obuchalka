package com.CodeWars.AbbreviateATwoWordName_8Kyu;

/**
 * Write a function to convert a name into initials.
 * This kata strictly takes two words with one space in between them.
 * The output should be two capital letters with a dot separating them.
 * It should look like this:
 *
 * Sam Harris => S.H
 *
 * Patrick Feeney => P.F
 */
public class Solution {
    public static void main(String[] args)
    {
        System.out.println(abbrevName("pier Poer"));
    }

    public static String abbrevName(String name)
    {
//        String x = name.charAt(0) + ".";
//        for (int i = 0; i < name.length(); i++)
//        {
//            if (name.charAt(i) == ' ')
//            {
//                i++;
//                x += name.charAt(i);
//            }
//        }
//        return x.toUpperCase();

//        var separate = name.split(" ");
//        var str = (separate[0].charAt(0) + "." + separate[1].charAt(0)).toUpperCase()+".";
//        return str;
        //лучшее решение на мой взгляд
        return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2.");
    }
}
