package TasksJavaRush.Course_22.Solution_3;

/*
Между табуляциями
*/

public class Solution
{
    public static String getPartOfString(String string) throws TooShortStringException
    {
        if (string == null || !string.contains("\t") || string.indexOf("\t")
                   == string.lastIndexOf("\t"))
            throw new TooShortStringException();
        return string.split("\t")[1];
    }

    public static class TooShortStringException extends Exception
    {
    }

    public static void main(String[] args) throws TooShortStringException
    {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
