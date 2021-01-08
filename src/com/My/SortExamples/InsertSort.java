package com.My.SortExamples;

import static java.lang.System.currentTimeMillis;

public class InsertSort
{

    public void insertSort(int[] arr)
    {
        long start = currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            int temp = arr[i];

            while (index > 0 && arr[index -1] >= temp) {
                arr[index] = arr[index -1];
                index--;
            }
            arr[index] = temp;
        }
        long stop = currentTimeMillis();
        System.out.print( (double) (stop - start)/1000);
    }
}
