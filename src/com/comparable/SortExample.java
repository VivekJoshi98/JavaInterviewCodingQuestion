package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

	public static void main(String[]s)
	{
		ArrayList<Emp> marks=new ArrayList<>();
		marks.add(new Emp(13,"sunil",6489));
		marks.add(new Emp(11,"Vivek",9540));
		marks.add(new Emp(15,"mannu",9550));
		
		System.out.println("Marks ::: "+marks);
	Collections.sort(marks);
	
	System.out.println(marks);
		
	}
}
