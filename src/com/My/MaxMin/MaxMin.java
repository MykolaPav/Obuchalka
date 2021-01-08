package com.My.MaxMin;

public class MaxMin {
    public int min(int[] list) {
        int q = Integer.MAX_VALUE;
        for (Integer x : list)
            Math.min(x, q);
        return q;

        // return Arrays.stream(list).min().getAsInt();
        // return IntStream.of(list).min().getAsInt();
        // return of(list).min().getAsInt();
        /*
         *  Arrays.sort(list);
         *  return(list[0]);
         */
    }

    public int max(int[] list) {
        int q = Integer.MIN_VALUE;
        for (Integer x : list)
            q =  Math.max(x, q);
        return q;

        //  return Arrays.stream(list).max().getAsInt();
        //  return IntStream.of(list).max().getAsInt();
        //  return of(list).max().getAsInt();
        /*
         *  Arrays.sort(list);
         *  return(list[list.length-1]);
         */
    }
}
