package com.My.SortExamples;

import static java.lang.System.currentTimeMillis;

public class SelectionSort
{
    public void printAll(int[] array)
    {
        System.out.println();
        for (int x : array)
            System.out.print(x + " ");
        System.out.println();
    }

    public void selectionSort(int[] arr)
    {
        long start = currentTimeMillis();
        for (int i = 0; i < arr.length; i++)
        {
            int minVal = arr[i];
            int minIndex = i;
            for (int j = i +1; j < arr.length; j++)
            {
                if (arr[j] < minVal)
                {
                    minVal = arr[j];
                    minIndex = j;
                }
            }
            if (i != minIndex)
            {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        long stop = currentTimeMillis();
        System.out.print( (double) (stop - start)/1000);
    }
}
