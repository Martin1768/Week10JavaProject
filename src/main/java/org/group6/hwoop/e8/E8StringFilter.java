package org.group6.hwoop.e8;

import java.util.ArrayList;
import java.util.List;

public class E8StringFilter
{
	public static void main(String[] args) {

		// You have a list of strings and you want to keep only those that start with
		// “A” and you want to return them in lower case"

		List<String> strArray = new ArrayList<>();
		strArray.add("garden");
		strArray.add("Adventure");
		strArray.add("chair");
		strArray.add("tree");
		strArray.add("Apple");
		strArray.add("book");
		strArray.add("Account");
		strArray.add("ocean");
		strArray.add("friend");
		strArray.add("Animal");

		System.out.println("The given words:");
		System.out.println(strArray);
		System.out.println();

		strArray.removeIf(s -> !s.startsWith("A"));
		strArray.replaceAll(e -> e.toLowerCase());

		System.out.println("The words starting with 'A' converted to lower case:");
        if (strArray.isEmpty()) System.out.println("[Not found]");
		else System.out.println(strArray);
	}
}
