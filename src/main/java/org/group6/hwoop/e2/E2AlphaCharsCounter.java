package org.group6.hwoop.e2;

import java.util.Scanner;

public class E2AlphaCharsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		String s1;
        System.out.print("Enter string (at least one character): ");
        s1 = scanner.nextLine();
        if (s1.isBlank()) {
            System.out.println("The entered string was blank.");
            return;
        }
        int result = s1.replaceAll("[^a-zA-Z]", "").length();

        System.out.println("String contains " + result + " aplha characters.");
    }
}