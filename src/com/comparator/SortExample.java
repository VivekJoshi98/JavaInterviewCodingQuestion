package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortExample {

	public static void main(String[]s)
	{
		ArrayList<Emp> marks=new ArrayList<>();
		marks.add(new Emp(17,"ABC",6454));
		marks.add(new Emp(13,"sunil",6489));
		marks.add(new Emp(11,"Vivek",9540));
		marks.add(new Emp(15,"mannu",9550));
		
		System.out.println("Marks ::: "+marks);
//	Collections.sort(marks,new Comparator<Emp>() {
//
//		@Override
//		public int compare(Emp o1, Emp o2) {
//			// TODO Auto-generated method stub
//			return o1.getEmpId()-o2.getEmpId();
//		}
//		
//	});
		
		Collections.sort(marks,new IdComparator());
		System.out.println("IdComparator :: "+marks);
	
	Collections.sort(marks,(e1,e2)->e1.getEmpId()-e2.getEmpId());
	System.out.println("Sorting id wise "+marks);
	Collections.sort(marks,(e1,e2)->e1.getName().compareTo(e2.getName()));
	System.out.println("Sorting name wise "+marks);
	
	
		
	}
}
