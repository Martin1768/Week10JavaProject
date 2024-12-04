package org.group6.hwoop.e4;

import java.util.Scanner;
import org.group6.hwoop.e3.E3ReverseString;

public class E4IsStringPalindrome
{
	public static void main(String[] args) {

		// Check if a String is Palindrome: Determine whether a given string is a
		// palindrome, which means it reads the same forwards and backward. For
		// example, "madam" is a palindrome.

		Scanner scanner = new Scanner(System.in);
		String s1, s1Reversed;
		do {
			System.out.print("Enter a word to check if it's a palindrome: ");
			s1 = scanner.next();
		} while (s1.isBlank());

		if (s1.length() == 1) {
		    System.out.println("'" + s1 + "' - every single character is a palindrome.");
            return;
        }
		s1Reversed = E3ReverseString.reverse(s1);
		if (s1.equals(s1Reversed)) System.out.println("The word '" + s1 + "' is a palindrome.");
		else System.out.println("The word '" + s1 + "' is not a palindrome.");
	}
}
