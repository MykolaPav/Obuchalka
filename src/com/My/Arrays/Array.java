package com.My.Arrays;

import java.util.Arrays;

public class Array {
    //Объявление переменных массива, инициализация проводится в методе
    int[] num3;
    int[] num4;
    int[] num5;
    int[] num6;
    int[] num7;
    int[] num8;

    public static void main(String[] args)
    {
        // Главный метод который вызывает функции(методы)

        /* Так как методы не static, нужно создать экземпляр класса
         * и с его(arrayObj) помощью  в методе main() вызывать любые функции или переменные
         */
        Array arrayObj = new Array();

        arrayObj.initializationArray();

        arrayObj.printArray();

        System.out.println("\n_________________________________________");

        arrayObj.lengthArray();
        System.out.println("\n_________________________________________");

        arrayObj.mathMinPrintArray();
        System.out.println("");

        arrayObj.sortArray();
        System.out.println("\n_________________________________________");

        arrayObj.copyArray();
        System.out.println("\n_________________________________________");

        arrayObj.equalsArray();
        System.out.print("\n_________________________________________");

        arrayObj.dArrayInitialization();
        arrayObj.dArrayPrint();
        System.out.print("\n_________________________________________");


    }

    public void printAll(int[] array)
    {
        System.out.println();
        for (int x : array)
            System.out.print(x + " ");
    }

    // Метод который выводит длину массива
    public void lengthArray()
    {
        System.out.print("Длина массива = " + num4.length);
    }

    // Инициализация массива
    public void initializationArray()
    {
        int[] num1 = new int[10]; // Массив из 10 чисел (пустой)
        int num2[] = new int[10]; // Массив из 10 чисел (пустой)

        // Устанавливаем значения элементов массива (вариант 1)
        num3 = new int[]{1,2,3,4,5,6,7,8,9,10}; // Массив из 10 чисел

        // Устанавливаем значения элементов массива (вариант 2)
        // Индексация элементов массива начинается с 0
        num4 = new int[4];
        num4[0] = 1;
        num4[1] = 2;
        num4[2] = 3;
        num4[3] = 4;

        //Заполнение массива из 10 чисел числами от 0 до 9: в цикле FOR
        num5 = new int[10];    //Создаем объект-массив на 10 элементов
        for (int i = 0; i < 10; i++)      //Цикл от 0 до 9
        {
            num5[i] = i;          //В ячейки заносим значения от 0 до 9
        }
    }

    // Метод который выводит в консоль данные массивов
    public void printArray()
    {
        //Вывод данных массива, выводится при помощи цикла FOR
        System.out.println("Вывод данных массива вариант 1 ");
        for (int i = 0; i < num3.length; i++)
        {
            System.out.print(num3[i] + " ");    //Выводим на экран очередную ячейку массива + пробел
        }
//_________________________________________________________________

        System.out.println("");
        //Вывод данных массива, выводится при помощи цикла FOR EACH
        System.out.println("Вывод данных массива вариант 2 ");
        for (int x : num4)
            System.out.print(x + " ");         //Выводим на экран очередную ячейку массива + пробел

        System.out.print("\nВывод данных массива вариант 3 ");
                   printAll(num3);  //Вызов метода который выводит данные принимая в качестве параметра массив

            System.out.println("\n_________________________________________");
//_________________________________________________________________

        //Вывод данны в обратном порядке
        System.out.println("Вывод данных массива в обратном порядке ");
        for (int i = 9;i >= 0; i--)             //Цикл от 9 до 0
        {
            System.out.print( num5[i] + " ");  //Выводим на экран очередную ячейку массива + пробел
        }
    }

    // Метод который выводит минимальное число в массиве
    public void mathMinPrintArray()
    {
        num6 = new int[] {-22, 15, 55, 40, 90, -155};
        //Минимальное число, вариант 1
        int min1 = num6[0];             //В качестве стартового числа взяли нулевой элемент массива

        for (int i = 1; i < num6.length; i++)
        {
            if (num6[i] < min1)        //Если текущий элемент массива меньше «найденного минимального числа»,
                min1 = num6[i];       //то «обновить значение минимального числа»
        }
        System.out.print("Минимальное число = " + min1 );
        System.out.println("\n_________________________________________");
//___________________________________________________________________________________________________

        //Минимальное число, вариант 2
        int min2 = Integer.MAX_VALUE;  //

        for (int x : num6) min2 = Math.min(min2, x);

        System.out.print("Минимальное число = " + min2 );
        System.out.print("\n_________________________________________");
    }

    // Метод сортировки массивов
    public void sortArray()
    {
        num7 = new int[] {8, 3, 4 , 9, 1, 6, 2, 5, 7, 10};
        num8 = new int[] {8, 3, 4 , 9, 1, 6, 2, 5, 7, 10};
        //Сортировка пузырьком
        System.out.print("Отсортированный массив №1");
        boolean isSorted = false;
        while (!isSorted)
        {
                isSorted = true;
        for (int i = 1; i < num7.length; i++) //Цикл идёт с первого индекса для того чтоб сравнивать с нулевым
            {
                if (num7[i] < num7[i - 1])   //Если число в ячейке [i] меньше чем число слева
                {
                    int temp = num7[i];      //То переменная temp равна этому числу
                    num7[i] = num7[i - 1];   //А ячейка [i] в этом месте равна числу слева
                    num7[i - 1] = temp;      //Ячейка слева [i -1] равна переменной temp которая хранила минимальное число
                    isSorted = false;
                }
            }
        }
        printAll(num7);
            System.out.println();
//______________________________________________________________________________________________________________________
        //Сортировка методом sort класса Arrays
        Arrays.sort(num8);
        System.out.print("Отсортированный массив №2\n");
        for (int x: num8)  // Вывод в консоль
        System.out.print(x + " ");
    }


    // Метод который копирует данные из какого-то массива
    public void copyArray()
    {
        //Первый массив
        int[] num = new int[] {9, 9, 9, 9, 9};

        //Копия первого массива
        System.out.print("Копия массива");
        int[] result1 = Arrays.copyOf(num, num.length);
        printAll(result1);

        //Копируя в массив большего размера, то пустые элементы заполнятся нулями
        int[] result2 = Arrays.copyOf(num, 10);
        printAll(result2);
    }

    //Метод который сравнивает массивы
    public void equalsArray()
    {
        int[] nums1 = new int[5];
        int[] nums2 = new int[5];
        Arrays.fill(nums1, 6);
        Arrays.fill(nums2, 6);
        //
        System.out.print("Сравнение массивов = " + Arrays.equals(nums1, nums2));
    }


    //ДВУМЕРНЫЕ МАССИВЫ
    int[][] dNum1;
    int[][] dNum2;
    int[][] dNum3;
    String[][] dNum4;
    String[][] dNum5;

    public void dArrayInitialization()
    {
        //Объявление двумерного массива размером 4 на 5
        dNum1 = new int[4][5];

        //Инициализация двумерного массива вариант 1
        dNum2 = new int[][] { {1, 2, 3, 4},  {5, 6, 7, 8, 9} };

        //Инициализация двумерного массива вариант 2
        dNum3 = new int[4][4];
        dNum3[0][0] = 1;  dNum3[2][0] = 9;
        dNum3[0][1] = 2;  dNum3[2][1] = 10;
        dNum3[0][2] = 3;  dNum3[2][2] = 11;
        dNum3[0][3] = 4;  dNum3[2][3] = 12;

        dNum3[1][0] = 5;  dNum3[3][0] = 13;
        dNum3[1][1] = 6;  dNum3[3][1] = 14;
        dNum3[1][2] = 7;  dNum3[3][2] = 15;
        dNum3[1][3] = 8;  dNum3[3][3] = 16;

//Массив Black and White в виде шахматной доски
        dNum4 = new String[8][8];  //Объявление размера массива
        for (int i = 0; i < dNum4.length; i++) //По строкам
        {
            for (int j = 0; j < dNum4.length; j++)   //По столбцам
            {
                if ((i + j) % 2 == 0) dNum4[i][j] = "W";
                else dNum4[i][j] = "B";
            }
        }

//Массив заполнен индексами ячеек, сделал для наглядности
        dNum5 = new String[8][8];  //Объявление размера массива
        for (int i = 0; i < dNum5.length; i++) //По строкам
        {
            for (int j = 0; j < dNum5.length; j++)  //По столбцам
            {
                dNum5[i][j] = " " + i + "." + + j;
            }
        }
    }

    public void dArrayPrint()
    {

        System.out.println("\nВывод двумерного массива вариант 1");
        for (int[] x : dNum3)
        {
            for (int j = 0; j < dNum3.length; j++)
            {
                System.out.print(" " + x[j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nВывод двумерного массива вариант 2");
        System.out.print(Arrays.deepToString(dNum3));
        System.out.print("\n_________________________________________");


        System.out.println("\nВывод двумерного массива шахматная доска");
        for (String[] strings : dNum4)
        {
            for (int j = 0; j < dNum4.length; j++)
            {
                System.out.print(" " + strings[j] + " ");
            }
            System.out.println();
        }
        System.out.print("\n_________________________________________");

        System.out.println("\nВывод двумерного массива с индексами");
        for (String[] strings : dNum5)
        {
            for (int j = 0; j < dNum5.length; j++)
            {
                System.out.print(" " + strings[j] + " ");
            }
            System.out.println();
        }
    }

}
