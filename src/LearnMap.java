import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

    public static void main(String[] args) {

//        Map<String, Integer> numbers = new TreeMap<>();
//
//        numbers.put("One", 1);
//        numbers.put("Two", 2);
//        numbers.put("Three", 3);
//        numbers.put("Four", 4);
//        numbers.put("Five", 5);
//
//
//        numbers.remove("Three");
//
////        if(!numbers.containsKey("Two")) {
////            numbers.put("Two", 23);
////        }
//
////        numbers.putIfAbsent("Two", 23);
//        System.out.println(numbers);
//        System.out.println(numbers.containsValue(3));
//
//        System.out.println(numbers.isEmpty());
//
//        for (Map.Entry<String, Integer> e: numbers.entrySet()) {
//            System.out.println(e);
//
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        for (String key: numbers.keySet()) {
//            System.out.println(key);
//        }
//
//        for(Integer value: numbers.values()) {
//            System.out.println(value);
//        }
    	
    	
    	
    	Map<Integer, String> map=new HashMap<>();
    	map.put(1, "Vivek");
    	map.put(2,"sunil");
    	map.put(3,"vicky");
    	map.put(6,"sunil");
    	map.put(4, "Vivek");
    	map.put(5,"vicky");
    	
    	System.out.println(map);
    	
    	for(Entry<Integer, String> m:map.entrySet())
    	{
    		System.out.println(m.getKey()+" "+ m.getValue());
    	}
    	for(String s : map.values())		
    	{
    		System.out.println(s);
    	}
    	for(Integer s : map.keySet())
    	{
    		System.out.println(s);
    	}
//    	 
//    	Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
//    	while(iterator.hasNext())
//    	{
//    		Map.Entry<Integer, String> next = iterator.next();
//    		System.out.println("Key : " +next.getKey() +"  values : "+next.getValue());
//    	}
    	
    	Iterator<Entry<Integer, String>> iterator=map.entrySet().iterator();
    	
    	while(iterator.hasNext())
    	{
    		Entry<Integer, String> next = iterator.next();
    		System.out.println(next.getKey()+" "+next.getValue()); 
    	}
    	
    	
    	
    	
    	
    }
}
