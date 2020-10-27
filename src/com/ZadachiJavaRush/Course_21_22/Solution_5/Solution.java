package com.ZadachiJavaRush.Course_21_22.Solution_5;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
Исправить ошибку. Сравнение объектов
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
        return ((o.first != null ? o.first.equals(this.first) : true)
             && (o.last != null ? o.last.equals(this.last) : true));
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
