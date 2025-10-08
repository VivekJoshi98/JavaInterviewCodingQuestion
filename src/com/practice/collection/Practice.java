package com.practice.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
//---------------------------------ArrayList---------------------------------------
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(13);
		
		
		System.out.println(list);
		
		for(int n:list)  // forEach loop
		{
			System.out.println(n);
		}
		//////////////////////////
		
		for(int i=0;i<list.size();i++) //forloop
		{
			System.out.println(list.get(i));
		}
		
		//https://chat.openai.com/share/88767151-0206-4d4f-a5dc-c11209a092b0
		list.forEach(i->System.out.println(i));// forEach method
		
		
		Iterator<Integer> iterator = list.iterator();//iterator
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("***************************************************************");
		ListIterator<Integer> listIterator = list.listIterator(); //ListIterator
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		
		//--------------------------------Set---Hashset------------------------------------		
		
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(12);
		hashSet.add(13);
		hashSet.add(14);
		System.out.println(hashSet);
		Iterator<Integer> it = hashSet.iterator();//iterator
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//--------------------------------Map---------------------------------------------
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Vivek");
		map.put(2, "Sunil");
		map.put(3, "Babita");
		
		Iterator<Entry<Integer, String>> iterate = map.entrySet().iterator();
	
		while(iterate.hasNext())
		{
			Entry<Integer, String> next = iterate.next();
			System.out.println(next.getKey()+" "+ next.getValue());
		}
		
		
		
		for(Map.Entry<Integer, String> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
		
	
	}
}
