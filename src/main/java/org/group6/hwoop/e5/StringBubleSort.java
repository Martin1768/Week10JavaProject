package org.group6.hwoop.e5;

public class StringBubleSort {

    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        boolean anyChange;

        for (int i = 0; i < charArray.length - 1; i++) {
            anyChange = false;

            for (int j = 0; j < charArray.length - 1 - i; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                    anyChange = true;
                }
            }

            if (!anyChange) {       // no change = string is sorted
                break;
            }
        }

        return new String(charArray);
    }
}