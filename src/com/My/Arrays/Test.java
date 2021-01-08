package com.My.Arrays;

import com.My.SortExamples.BubbleSort;
import com.My.SortExamples.InsertSort;
import com.My.SortExamples.QuickSort;
import com.My.SortExamples.SelectionSort;

import java.util.Random;

import static java.lang.System.currentTimeMillis;

public class Test {

   public static int[] array()
   {
       Random random = new Random();

       int[] array = new int[100_000];
       for (int i = 0; i < 100_000; i++) {
           array[i] = random.nextInt(10_000);
       }
       return array;
   }
    public static void main(String[] args) {

        System.out.print("Quick sort\n");
        QuickSort quickSort = new QuickSort();
        long start = currentTimeMillis();
        quickSort.qSort(array(), 0, array().length -1);
        long stop = currentTimeMillis();
        System.out.print( (double) (stop - start)/1000);

        System.out.print("\nInsert sort\n");
        InsertSort inSort = new InsertSort();
        inSort.insertSort(array());

        System.out.print("\nSelection sort\n");
        SelectionSort sort = new SelectionSort();
        sort.selectionSort(array());

        BubbleSort bubble = new BubbleSort();
        System.out.print("\nBubble sort\n");
        bubble.bubbleSortArray(array());
        bubble.bubbleSortArray1(array());
        bubble.bubbleSortArray2(array());
//        bubble.bubbleSortArray3(array());
//        bubble.bubbleSortArray4(array());
//        bubble.bubbleSortArray5(array());
    }
}
