package com.My.SortExamples;

import java.util.Arrays;

import static java.lang.System.currentTimeMillis;

public class BubbleSort {

    //BUBBLE SORT

    public void bubbleSortArray(int[] arr)
    {
        long start = currentTimeMillis();
        Arrays.sort(arr);
        long stop = currentTimeMillis();
        System.out.println( (double) (stop - start)/1000);
    }

    public void bubbleSortArray1(int[] arr)
    {
        int step = (int) (arr.length/1.247);
        int swapCount = 0;
        long start = currentTimeMillis();
        while (step > 1 || swapCount > 0)
        {
            swapCount = 0;
            for (int i = 0; i + step < arr.length; i++)
            {
                if (arr[i] > arr[i + step]){
                    int temp = arr[i];
                    arr[i] = arr[i + step];
                    arr[i + step] = temp;
                    swapCount++;
                }
            }
            if (step > 1)
            {
                step = (int) (step/1.247);
            }
        }
        long stop = currentTimeMillis();
        System.out.println( (double) (stop - start)/1000);
    }

    public void bubbleSortArray2(int[] arr)
    {
        long start = currentTimeMillis();
        for (int i = 0; i < arr.length; i++)
        {
            int rightNum = arr[i];

            for (int j = i - 1; j >= 0 ; j--)
            {
                int leftNum = arr[j];
                if (rightNum < leftNum)
                {
                    arr[j +1] = leftNum;
                    arr[j] = rightNum;
                }else break;
            }
        }
        //System.out.println(Arrays.toString(arr));
        long stop = currentTimeMillis();
        System.out.println( (double) (stop - start)/1000);
    }
//_____________________________________________________________________________________________________
    public void bubbleSortArray3(int[] arr)
    {
        long start = currentTimeMillis();
        for (int i = arr.length -1; i > 0; i--)  //Цикл идёт с конца
        {
            for (int j = 0; j < i ; j++)         //Цикл повторяется пока первый не дойдёт до нуля
            {
                if (arr[j] > arr[j +1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j +1] = temp;
                }
            }
        }
        long stop = currentTimeMillis();
        System.out.println( (double) (stop - start)/1000);
    }
//_____________________________________________________________________________________________________
    public void bubbleSortArray4(int[] arr)
    {
        long start = currentTimeMillis();
        boolean isSorted = false;
        while (!isSorted)
        {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) //Цикл идёт с первого индекса для того чтоб сравнивать с нулевым
            {
                if (arr[i] < arr[i - 1])         //Если число в ячейке [i] меньше чем число слева
                {
                    int temp = arr[i];           //То переменная temp равна этому числу
                    arr[i] = arr[i - 1];         //А ячейка [i] в этом месте равна числу слева
                    arr[i - 1] = temp;           //Ячейка слева [i -1] равна переменной temp которая хранила минимальное число
                    isSorted = false;
                }
            }
        }
        long stop = currentTimeMillis();
        System.out.println((double) (stop - start)/1000);
    }
//_____________________________________________________________________________________________________
    public void bubbleSortArray5(int[] arr)
    {
        long start = currentTimeMillis();
        int count;
        do {
            count = 0;  //Каждую итерацию сброс на 0
            for (int i = 0; i < arr.length -1; i++)
            {
                if (arr[i] > arr[i +1])     //Если цикл пройдёт и не найдёт условие,
                {                           //код не выполнится и count останется 0. Цикл остановится.
                    int temp = arr[i];
                    arr[i] = arr[i +1];
                    arr[i +1] = temp;
                    count++;      //Если код выполнился то переменная стала больше нуля
                }
            }
        }
        while (count > 0); //Выполнять пока count больше нуля
        long stop = currentTimeMillis();
        System.out.println( (double) (stop - start)/1000);
    }
//_____________________________________________________________________________________________________


}
