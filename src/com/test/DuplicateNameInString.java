package com.test;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNameInString {

	public static void main(String[] args) {

		String names = "vivek,tushar,santosh,yuvraj,deepali,vivek";
		
		Map<String, Integer> map=new HashMap<>();
		String[] split = names.split(",");
		
		for(String name:split)
		{
			if(map.containsKey(name))
			{
				Integer count = map.get(name);
				map.put(name, count+1);
			}
			else
			{
				map.put(name,1);
			}
		}
		
		System.out.println("Duplicate Name is : ");
	
		for(Map.Entry<String, Integer> m:map.entrySet())
		{
			if(m.getValue()>1)
			{
				System.out.println(m.getKey());
			}
		}
	}
}
