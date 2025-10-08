package com.practice.practice030925;

import java.util.HashMap;
import java.util.Map;

public class MaximumRepeatedCharacter {

	public static void main(String[] args) {

		String str = "aabbccc";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char maxChar = ' ';
		int maxValue = 0;

		char[] charArray = str.toCharArray();

		for (char c : charArray) {
			if (map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, ++count);
			} else {
				map.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() > maxValue) {
				maxValue=m.getValue();
				maxChar=m.getKey();
			}
		}



		System.out.println("Maximum Repeated character is " + maxChar);
	}
}