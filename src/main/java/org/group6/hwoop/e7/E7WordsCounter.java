package org.group6.hwoop.e7;

import java.util.Arrays;

public class E7WordsCounter
{
	public static void main(String[] args) {

		// Count the Number of Words in a String: Write a function to count the
		// number of words in a given string. Words are separated by spaces or
		// punctuation. For example, the input "Hello, world!" should return 2.

		String s1 = "Hello,    world !  It    works  ,  right?";
		// String s1 = "HelloWorldItWorksRight";

		String[] s2 = s1.split("([^a-zA-Z0-9]{1,})");

		System.out.println("The given sentence '" + s1 + "'");
		System.out.println("contains " + s2.length + " word" + ((s2.length == 1)? ": ":"s: ") + Arrays.toString(s2));
	}
}
