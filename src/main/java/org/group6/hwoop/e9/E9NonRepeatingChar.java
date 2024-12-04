package org.group6.hwoop.e9;

import java.util.LinkedHashMap;
import java.util.Map;

public class E9NonRepeatingChar {
    public static void main(String[] args) {
        String s = "abracadabra";

        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for(Character c : s.toCharArray())
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

        boolean found = false;
        for (Map.Entry<Character, Integer> e : freqMap.entrySet())
            if (e.getValue() == 1) {
                System.out.println("The first non-repeating char in the word '" + s + "' is '" + e.getKey() + "'.");
                found = true;
                break;
            }
        if (!found)
            System.out.println("The word '" + s + "' does not contain any non-repeated characters.");
    }
}
