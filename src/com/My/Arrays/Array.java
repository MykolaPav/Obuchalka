package com.My.Arrays;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collections;
import java.util.Scanner;

public class Array {
    public void javaRush() throws IOException {
        //Заполнение массива из 10 чисел числами от 0 до 9:
        int[] arr1 = new int[10];    //Создаем объект-массив на 10 элементов
        for (int i=0;i<10;i++)      //Цикл от 0 до 9
        {
            arr1[i] = i;          //В ячейки заносим значения от 0 до 9
        }

        //Заполнение массива из 10 чисел числами от 1 до 10:
        int[] arr2 = new int[10];    //Создаем объект-массив на 10 элементов
        for (int i=0;i<10;i++)      //Цикл от 0 до 9
        {
            arr2[i] = i+1;        //В ячейки заносим значения от 10 до 1
        }

        //Вывод чисел в обратном порядке
        Scanner console = new Scanner(System.in);   //Создаем объект Scanner
        int[] arr3 = new int[10];                  //Создаем объект-массив на 10 элементов
        for (int i=0;i<10;i++)                    //Цикл от 0 до 9
        {
            arr3[i] = console.nextInt();        //Читаем число с клавиатуры и сохраняем его в очередную ячейку массива
        }
        for (int i=9;i>=0;i--)                //Цикл от 9 до 0
        {
            System.out.println( arr3[i] );  //Выводим на экран очередную ячейку массива
        }


        Scanner console2 = new Scanner(System.in);   //Создаем объект Scanner
        int[] arr4 = new int[10];                   //Создаем объект-массив на 10 элементов
        for (int i=0;i<10;i++)                     //Цикл от 0 до 9
        {                                         //
            arr3[i] = console2.nextInt();        //Читаем число с клавиатуры и сохраняем его в очередную ячейку массива
        }                                       //
        int min = arr4[0];                     //В качестве минимального числа взяли нулевой элемент массива
        for (int i=1;i<10;i++)                //Цикл от 1 до 9
        {                                    //
            if (arr4[i] < min)              //Если текущий элемент массива меньше «найденного минимального числа»,
                min = arr4[i];             //то «обновить значение минимального числа»
        }                                 //
        System.out.println( min );       //Вывести найденное минимальное число на экран

        //«вводит с клавиатуры 10 строк и выводит их на экран в обратном порядке»
        Scanner console3 = new Scanner(System.in);   //Создаем объект Scanner
        String[] arr5 = new String[10];             //Создаем объект-массив на 10 элементов
        for (int i=0;i<10;i++)                     //Цикл от 0 до 9
        {                                         //
            arr3[i] = console2.nextInt();        //Читаем строку с клавиатуры и сохраняем его в очередную ячейку массива
        }                                       //
        for (int i=9;i>=0;i--)                 //Цикл от 9 до 0
        {                                     //
            System.out.println( arr5[i] );   //Выводим на экран очередную ячейку массива
        }

            int[] a1 = new int[20];
            int[] b2 = new int[10];
            int[] c3 = new int[10];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 20; i++)             //Читаем число с клавиатуры и сохраняем его в a1 массив
                a1[i] = sc.nextInt();


            for (int i = 0; i < 10; i++) {      // Копируем первую половину массива a1 в b2 массив
                b2[i] = a1[i];
            }
            for (int i = 0; i < 10; i++) {    //Копируем вторую половину массива a1 в массив c3
                c3[i] = a1[i + 10];
            }

            for (int i = 0; i < 10; i++) { // выводим массив на экран
                System.out.println(c3[i]);
            }

        int[] arr = new int[15];
        int even = 0;
        int odd = 0;
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            arr[i] = sc1.nextInt();
            if (i %2 == 0)                        // Счетчик какая сумма в чётных и нечетных индексах массива
                even += arr[i];
            else if
            (i %2 != 0)
                odd += arr[i];
        }
        if (even > odd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
 class Array_List{
     public static void javaRush(String[] args) throws IOException {
         Reader r = new InputStreamReader(System.in);
         BufferedReader reader = new BufferedReader(r);

          //ввод строк с клавиатуры
         ArrayList<String> list = new ArrayList<>();
         for (int i = 0; i < 10; i++)
         {
             String s = reader.readLine();
             list.add(s);
         }
//вывод содержимого коллекции на экран
//         for (int i = list.size()-1; i >=0; i--)
//             System.out.println( list.get(i));

         for (int i = 0; i < list.size(); i++) {
             int j = list.size() - i - 1;
             System.out.println( list.get(j) );
         }
//То же, чётные числа добавляются в конец списка, нечётные — в начало.
         BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
         ArrayList<Integer> list3 = new ArrayList<Integer>();

         while (true)
         {
             String s = reader.readLine();
             if (s.isEmpty()) break;

             int x = Integer.parseInt(s);
             if (x % 2 == 0)  //проверяем, что остаток от деления на два равен нулю
                 list3.add(x);          //добавление в конец
             else
                 list3.add(0, x);      //вставка в начало
         }
//Удаление всех чисел больше 5:
         BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in) );
         ArrayList<Integer> list2 = new ArrayList<>();
         list2.add(1);
         list2.add(7);
         list2.add(11);
         list2.add(3);
         list2.add(15);
         for (int i = 0; i < list.size(); )    //убрали увеличение i внутрь цикла
         {
             if (list2.get(i) > 5)
                 list2.remove(i);          //не увеличиваем i, если удалили текущий  элемент
             else
                 i++;
         }
//Разделение массива на два — чётных и нечётных чисел
         //статическая инициализация массива
         int[] data = {1, 5, 6, 11, 3, 15, 7, 8};

         //создание списка, где все элементы должны быть типа Integer
         ArrayList<Integer> list1 = new ArrayList<> ();

         //заполнение списка из массива
         for (int i = 0; i < data.length; i++) list1.add(data[i]);

         ArrayList<Integer> even = new ArrayList<>();  //чётные
         ArrayList<Integer> odd = new ArrayList<>();    //нечётные

         for (int i = 0; i < list1.size(); i++)
         {
             Integer x = list1.get(i);
             if (x % 2 == 0)    //если x - чётное
                 even.add(x);   // добавляем x в коллекцию четных чисел
             else
                 odd.add(x);    // добавляем x в коллекцию нечетных чисел
         }

         //Слияние списков.
         ArrayList<Integer> list5 = new ArrayList<>();   //создание списка
         Collections.addAll(list5, 1, 5, 6, 11, 3, 15, 7, 8);   //заполнение списка

         ArrayList<Integer> list6 = new ArrayList<>();
         Collections.addAll(list6, 1, 8, 6, 21, 53, 5, 67, 18);

         ArrayList<Integer> result = new ArrayList<>();

         result.addAll(list1);   //добавление всех значений из одного списка в другой
         result.addAll(list2);

         for (Integer x : result)   //быстрый for по всем элементам, только для коллекций
         {
             System.out.println(x);
         }
     }
}