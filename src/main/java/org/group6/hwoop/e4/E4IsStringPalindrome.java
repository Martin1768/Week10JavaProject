package org.group6.hwoop.e4;

import java.util.Scanner;

import org.group6.hwoop.e3.E3ReverseString;

public class E4IsStringPalindrome
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1, s1Reversed;
		do {
			System.out.print("Enter word to reverse (at least one alpha character): ");
			s1 = scanner.next();
		} while (s1.isBlank());

		if (s1.length() == 1) {
		    System.out.println("Reversed word: " + s1);
            return;
        }
		s1Reversed = E3ReverseString.reverse(s1);
		if (s1.equals(s1Reversed)) System.out.println("Word " + s1 + " is a palindrome.");
		else System.out.println("Word " + s1 + " is not a palindrome.");
	}
}
