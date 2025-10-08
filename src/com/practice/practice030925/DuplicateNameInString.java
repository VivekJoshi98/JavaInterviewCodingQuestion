package com.practice.practice030925;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNameInString {

	public static void main(String[] args) {
		
		String names = "John,Emma,John,Mary,Emma";
		
		Map<String, Integer> map= new HashMap<>();
		
		String[] split = names.split(",");
		
		for(String s:split)
		{
			if(map.containsKey(s))
			{
				int count = map.get(s);
				map.put(s, ++count);
			}
			else
			{
				map.put(s, 1);
			}
				
		}
		
		boolean foundDuplicate=true;
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
				foundDuplicate=false;
			}	
	//		 .out.println(entry.getKey() +" "+entry.getValue());
		}
		
		if(foundDuplicate)
		{
			System.out.println("Did not find any duplicate value");
		}
		
	}
}
