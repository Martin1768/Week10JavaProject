package org.group6.hwoop.e8;

import java.util.ArrayList;
import java.util.List;

public class E8StringFilter
{
	public static void main(String[] args) {
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

		System.out.println("Words starting with 'A' converted to lower case:");
        if (strArray.isEmpty()) System.out.println("[Not found]");
		else System.out.println(strArray);
	}
}
