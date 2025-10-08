package basic.program.practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNameInString {

	
	public static void main(String[] args) {
		String name="vivek,sunil,sunil,babita,vivek";
		String[] split = name.split(",");
		
		HashMap<String, Integer> map=new HashMap<>();
		
		for(String s:split)
		{
			if(map.containsKey(s))
			{
				int count = map.get(s);
				map.put(s, count+1);
			}
			else
			{
				map.put(s, 1);
			}
		}
		
		
		System.out.println("Duplicte name is :: ");
		for(Map.Entry<String, Integer> m:map.entrySet())
		{
			if(m.getValue()>1)
			{
				System.out.println(m.getKey());
			}
		}
		
	}
	
}
