package com.test;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNameInString {

	public static void main(String[] args) {
		
		String name="vivek,tushar,santosh,yuvraj,deepali,vivek";
		
		String[] split = name.split(",");
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		for(String n:split)
		{
			if(map.containsKey(n))
			{
				int count = map.get(n);
				map.put(n, count+1);
			}
			else
			{
				map.put(n,1);
			}
		}
		
		for(Map.Entry<String, Integer> m:map.entrySet())
		{
			if(m.getValue()>1)
			{
				System.out.println(m.getKey()+" : "+m.getValue());
			}
	//		System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
}
