package org.group6.hwoop.e6;

import java.util.Scanner;

public class E6VowelsCounter
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1;
		do {
			System.out.print("Enter word (at least one alphabetic character): ");
			s1 = scanner.next();
		} while (s1.isBlank());

		System.out.println("Entered word: " + s1);

		int vowels = s1.replaceAll("[^aeiouy]", "").length();

		System.out.println("The word contains " + vowels + " vowel" + ((vowels == 1)? ".":"s."));
	}
}
