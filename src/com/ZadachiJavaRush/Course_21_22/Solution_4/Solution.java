package com.ZadachiJavaRush.Course_21_22.Solution_4;

import java.util.HashSet;
import java.util.Set;

/*
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object n)
    {
        if (this == n) return true;
        if (!(n instanceof Solution))
            return false;
        Solution o = (Solution) n;
        return ((o.first != null ? o.first.equals(this.first) : false) && (o.last != null ? o.last.equals(this.last) : true));
    }

    public int hashCode() {
        return 31 * first.hashCode() + last.hashCode();
    }

    public static void main(String[] args)
    {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}