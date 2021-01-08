package com.My.SortExamples;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.currentTimeMillis;

public class QuickSort
{
    public static void main(String[] args)
    {
        QuickSort quickSort = new QuickSort();
        Random random = new Random();

        int[] array = new int[8];
        for (int i = 0; i < 8; i++) {
            array[i] = random.nextInt(100_000);
        }
        long start = currentTimeMillis();
        quickSort.qSort(array, 0, array.length -1);
        long stop = currentTimeMillis();
        System.out.println(stop - start);
        System.out.println(Arrays.toString(array));
    }

    public void qSort(int[] arr, int first, int last)
    {
        if (arr.length <= 1 && first >= last)  return;

        int i = first;
        int j = last;
        int pivot = arr[(i + j)/2];

        do {
            while (arr[i] < pivot) { i++; }
            while (arr[j] > pivot) { j--; }

            if (i <= j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }while (i <= j);

        if (first < j) qSort(arr, first, j);
        if (i < last) qSort(arr, i, last);
    }
    //
}
