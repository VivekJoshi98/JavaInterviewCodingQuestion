package com.test;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatedCharacter {

	public static void main(String[] args) {

		String c = "abbcc";

		char[] charArray = c.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();

		for (char ch : charArray) {
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, count + 1);
			} else
				map.put(ch, 1);
			
		}
		
		for(Map.Entry<Character, Integer> m:map.entrySet())
		{
			if(m.getValue()>1)
			{
				System.out.println(m.getKey()+" : "+m.getValue());
			}
		}

	}
}