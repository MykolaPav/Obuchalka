package com.My.String;

public class SplitExamples
{     /** Метод split() класса String позволяет стоку разбить на массив отдельных данных
       *  и принимает в себя регулярные выражения.
       */

    public void splitString(String str)
    {   //Разбивает входящую строку на массив отдельных слов
        String[] result = str.split(" ");
        for (var x: result)
            System.out.println(x);
    }

    public String splitStringEmail(String str)
    {   //Возвращает значение по индексу массива, созданного из строки
        String[] result = str.split("\\|");
        return result[0];
    }

    public double splitDouble(String str)
    {
        //Метод разбивает строку на массив по знаку (;)
        double totalAmount = 0d;
        final String[] items = str.split(";");

        //потом второй массив по (,) и плюсует данные из каждого второго индекса
        for (var x: items) {
            final String[] itemInfo = x.split(",");
            totalAmount += Double.parseDouble(itemInfo[2]);
        }
        return totalAmount;
    }
}
