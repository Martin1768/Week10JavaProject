package org.group6.hwoop.e3;

import java.util.Scanner;

public class E3ReverseString
{
	// Reverse a String: Write a function to reverse a given string.
	// For example, given the input "Hello", the output should be "olleH".

    public static String reverse(String s) {
        StringBuilder result = new StringBuilder();
        for (Character c : s.toCharArray()) {
            result.insert(0, c);
        }
        return result.toString();
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1;
		do {
			System.out.print("Enter text to reverse (at least one alpha character): ");
			s1 = scanner.nextLine();
		} while (s1.isBlank());

		System.out.println("The given text: '" + s1 + "'");
		if (s1.length() == 1) {
		    System.out.println("Reversed text: " + s1);
            return;
        }

		System.out.println("Reversed text: '" + reverse(s1) + "'");
	}
}
