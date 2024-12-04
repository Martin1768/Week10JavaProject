package org.group6.hwoop.e10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class E10RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(2,13,10,2,5,5,10,11,12,11,13,1,1));

        System.out.println("The given list:");
        System.out.println(integerList);
        System.out.println();

        LinkedHashSet<Integer> uniqueIntSet = new LinkedHashSet<>(integerList);
        integerList.clear();
        integerList.addAll(uniqueIntSet);

        System.out.println("The same list, with the same order, but duplicates were removed:");
        System.out.println(integerList);
    }
}
