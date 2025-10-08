package com.practice.practice030925;

import java.util.HashSet;
import java.util.Set;

public class FindRepeatedChar {

	public static void main(String[] args) {

		String str = " mM*abb cVvcd dAdd ";
		String lowerCase = str.toLowerCase().trim();

		char[] charArray = lowerCase.toCharArray();
		//System.out.println();

		Set<Character> set = new HashSet<Character>();
		Set<Character> duplicate = new HashSet<Character>();

		for (char c : charArray) {
			if(c=='*' || c==' ')
			{
				continue;
			}
			if (set.contains(c) ) {

				if (!duplicate.contains(c)) {
					System.out.println(c);
					duplicate.add(c);
				}
			} else {
				set.add(c);
			}
		}
	}
}
