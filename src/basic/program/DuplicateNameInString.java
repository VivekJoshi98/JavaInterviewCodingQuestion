package basic.program;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNameInString {
    public static void main(String[] args) {
        String names = "John,Emma,John,Mary,Emma";
        Map<String, Integer> nameCountMap = new HashMap<>();

        // Split the names string by comma
        String[] nameArray = names.split(",");

        // Count the occurrence of each name
        for (String name : nameArray) {
            if (nameCountMap.containsKey(name)) {
                int count = nameCountMap.get(name);	//it will return the value of key.
          //      System.out.println(count);
                nameCountMap.put(name, count + 1);
            } else {
                nameCountMap.put(name, 1);
            }
        }

        // Print duplicate names
        System.out.println("Duplicate names:");
        for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
        	
 //       	System.out.println(entry.getKey()+ "This name print "+ entry.getValue()+ " times");
        	
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
