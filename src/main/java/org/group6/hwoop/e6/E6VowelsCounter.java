package org.group6.hwoop.e6;

import java.util.Scanner;

public class E6VowelsCounter
{
	public static void main(String[] args) {

		// Create a method to count how many vowels are present in a string
		// “documentation”

		Scanner scanner = new Scanner(System.in);
		String s1;
		do {
			System.out.print("Enter a word (at least one alphabetic character): ");
			s1 = scanner.next();
		} while (s1.isBlank());
		scanner.nextLine();	// discard the rest of the line

		int vowels = s1.toLowerCase().replaceAll("[^aeiouy]", "").length();

		System.out.println("The word '" + s1 + "' contains " + vowels + " vowel" + ((vowels == 1)? ".":"s."));
	}
}
