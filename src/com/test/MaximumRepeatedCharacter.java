package com.test;

import java.util.HashMap;
import java.util.Map;

public class MaximumRepeatedCharacter {

	public static void main(String[] args) {
		
		String str = "aabbccc";
		int maxValue=0;
		char maxChar=' ';
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		char[] charArray = str.toCharArray();
		
		for(char c:charArray)
		{
			if(map.containsKey(c))
			{
				int count = map.get(c);
				map.put(c, count+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> m : map.entrySet())
		{
			if(m.getValue()>maxValue)
			{
				maxValue=m.getValue();
				maxChar=m.getKey();
			}
		}
		
		System.out.println("Maximum Repeated charcter is "+maxChar);
	}
}
