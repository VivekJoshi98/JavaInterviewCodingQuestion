package revise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LearnArrayList {

	public static void main(String []s)
	{
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Vivek Joshi");//Adding object in arraylist  
		list.add("Vijay Shankar");  
		list.add("Kamlesh");  
		list.add("Santosh");  
		//Traversing list through Iterator  h
		
		Iterator<String> iterators = list.iterator();
		while(iterators.hasNext())
		{
			System.out.println(" "+iterators.next());	
		}
		
		
		List li=new ArrayList();
		li.add("vivek");
		li.add(12);
		String v=(String) li.get(0);
		System.out.println(v);
		System.out.println(li);
		
		
		List<String> l=new LinkedList<String>();
		
		
		Map<Integer, String> m1=new HashMap<>();
		m1.put(1, "Vivek Joshi");
		m1.put(2, "Vijay Shankar");
		m1.put(3, "Kamlesh lace");
		for(Map.Entry<Integer,String> e:m1.entrySet())
		{
			System.out.println("MAP :::"+e.getKey()+ ""+ e.getValue());
		}
		
	}
}
