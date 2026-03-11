package com.practice.practice030925;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatedChar {

//	public static void main(String[] args) {
//
//		String str = " mM*abb cVvcd dAdd ";
//		String lowerCase = str.toLowerCase().trim();
//
//		char[] charArray = lowerCase.toCharArray();
//		//System.out.println();
//
//		Set<Character> set = new HashSet<Character>();
//		Set<Character> duplicate = new HashSet<Character>();
//
//		for (char c : charArray) {
//			if(c=='*' || c==' ')
//			{
//				continue;
//			}
//			if (set.contains(c) ) {
//
//				if (!duplicate.contains(c)) {
//					System.out.println(c);
//					duplicate.add(c);
//				}
//			} else {
//				set.add(c);
//			}
//		}
//	}
	
	
	public static void main(String[] args) {
		
		String str = " mM*abb cVvcd dAdd ";
		
		char[] charArray = str.toLowerCase().toCharArray();
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(char c:charArray)
		{
			if(c=='*'||c==' ')
			{
				continue;
			}
			
			if(map.containsKey(c))
			{
				int count = map.get(c);
				map.put(c, ++count);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" "+ entry.getValue());
			}
		}
		
	}
}
