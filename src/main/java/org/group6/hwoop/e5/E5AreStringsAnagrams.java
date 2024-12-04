package org.group6.hwoop.e5;

import java.util.Scanner;

public class E5AreStringsAnagrams
{
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
			System.out.print("Enter word to reverse (at least one alpha character): ");
			s1 = scanner.next();
		} while (s1.isBlank());

		do {
			System.out.print("Enter word to reverse (at least one alpha character): ");
			s2 = scanner.next();
		} while (s2.isBlank());

		if (isAnagram(s1, s2)) System.out.println("Words are anagrams.");
		else System.out.println("Words are not anagrams.");
	}
}

/*
Test strings:
"listen", "silent" > true
"triangle", "integral" > true
"apple", "pabble" > false
 */