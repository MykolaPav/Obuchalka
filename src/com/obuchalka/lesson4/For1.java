package com.obuchalka.lesson4;

public class For1 {
//    public void foo() {
//        for (int i = 10; i >= 0; i = i - 2) {
//            System.out.println(i);
//        }
//    }

      int [] array = {1,2,3,6,-1};
      public void foo() {
          for (int element: array) {   //"Идентичный код" // for(int = 0; i<array.length; i++)
              System.out.println(element);               // System.out.println(array[i]);
          }
      }
}
