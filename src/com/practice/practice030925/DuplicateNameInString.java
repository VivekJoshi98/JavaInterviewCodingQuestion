package com.practice.practice030925;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNameInString {

	public static void main(String[] args) {
		
		String names = "John,Emma,John,Mary,Emma";
		
		String[] split = names.split(",");
		
		HashMap<String, Integer> map=new HashMap<>();
		
		for(String str:split)
		{
			if(map.containsKey(str))
			{
				int count = map.get(str);
				map.put(str, count+1);
			}
			else
			{
				map.put(str, 1);
			}
		}
		

		   // Print only duplicates
		        System.out.println("Duplicate names:");
//		        map.forEach((key, value) -> {
//		            if (value > 1) {
//		                System.out.println(key + " = " + value);
//		            }
//		        });

		        for(Map.Entry<String, Integer> m:map.entrySet())	        	
		        {
		        	if(m.getValue()>1)
		        	System.out.println(m.getKey()+" "+m.getValue());
		        }
	}
}
