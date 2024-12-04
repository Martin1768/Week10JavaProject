package org.group6.hwoop.e3;

import java.util.Scanner;

public class E3ReverseString
{
    public static String reverse(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) + result;
        }
        return result;
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1;
		do {
			System.out.print("Enter word to reverse (at least one alpha character): ");
			s1 = scanner.next();
		} while (s1.isBlank());

		if (s1.length() == 1) {
		    System.out.println("Reversed word: " + s1);
            return;
        }

		System.out.println("Reversed word: " + reverse(s1));
	}
}
