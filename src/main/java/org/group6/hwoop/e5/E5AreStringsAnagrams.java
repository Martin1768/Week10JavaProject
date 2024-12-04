package org.group6.hwoop.e5;

import java.util.Scanner;

public class E5AreStringsAnagrams
{
	// Check if Two Strings are Anagrams: Given two strings, determine if they
	// are anagrams, meaning they contain the same characters in a different order.
	// For example, "listen" and "silent" are anagrams.

	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		return StringBubleSort.sortString(s1).equals(StringBubleSort.sortString(s2));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		do {
			System.out.print("Enter the 1st word (at least one alpha character): ");
			s1 = scanner.next();
		} while (s1.isBlank());
		scanner.nextLine();	// discard the rest of the line

		do {
			System.out.print("Enter the 2nd word (at least one alpha character): ");
			s2 = scanner.next();
		} while (s2.isBlank());
		scanner.nextLine();  // discard the rest of the line

		if (isAnagram(s1, s2)) System.out.println("The words '" + s1 + "' and '" + s2 + "' are anagrams.");
		else System.out.println("The words '" + s1 + "' and '" + s2 + "' are not anagrams.");
	}
}

/*
Test strings:
"listen", "silent" > true
"triangle", "integral" > true
"apple", "pabble" > false
 */