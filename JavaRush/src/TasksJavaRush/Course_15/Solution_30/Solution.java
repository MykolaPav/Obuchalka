package TasksJavaRush.Course_15.Solution_30;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.

Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double: 3.14
 */
public class Solution
{

    public static void main(String[] args) throws Exception
    {

     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        //add your code here
        StringBuilder strBuilder = new StringBuilder();
        String[] prm_val = url.substring(url.indexOf("?") +1).split("&");

        for (var x : prm_val)
        {
            if (x.contains("=")) strBuilder.append(x, 0, x.indexOf("=")).append(" ");
            else strBuilder.append(x).append(" ");
        }
        String res = String.valueOf(strBuilder).trim();
        System.out.println(res);

        for (var x: prm_val)
        {
            if (x.contains("obj"))
            {
                try {
                    alert(Double.parseDouble(x.substring(x.indexOf("=") +1)));
                }catch (Exception e)
                {
                    alert(x.substring(x.indexOf("=") +1));
                }
            }
        }
    }

    public static void alert(double value)
    {
        System.out.println("double: " + value);
    }

    public static void alert(String value)
    {
        System.out.println("String: " + value);
    }
}
