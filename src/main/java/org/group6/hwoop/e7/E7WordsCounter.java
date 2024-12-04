package org.group6.hwoop.e7;

import java.util.Arrays;

public class E7WordsCounter
{
	public static void main(String[] args) {
		String s1 = "Hello,    world !  It    works  ,  right?";
		// String s1 = "HelloWorldItWorksRight";

		String[] s2 = s1.split("([^a-zA-Z0-9]{1,})");

		System.out.println("The given sentence \"" + s1 + "\"");
		System.out.println("contains " + s2.length + " word" + ((s2.length == 1)? ": ":"s: ") + Arrays.toString(s2));
	}
}
