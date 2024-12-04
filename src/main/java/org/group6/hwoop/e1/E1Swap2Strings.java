package org.group6.hwoop.e1;

import java.util.Scanner;

public class E1Swap2Strings
{
	public static void main(String[] args) {

		// Write a program to swap 2 String without a temporary variable

		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		do {
			System.out.print("Enter 1st word (at least one alphabetic character): ");
			s1 = scanner.next();
		} while (s1.isBlank());

		do {
			System.out.print("Enter 2nd word (at least one alphabetic character): ");
			s2 = scanner.next();
		} while (s2.isBlank());

		System.out.println("Entered words: " + s1 + ", " + s2);

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("Swapped words: " + s1 + ", " + s2);
	}
}
