package basic.program.Array;

import java.util.Arrays;

public class CompareTwoArray {

	public static void main(String[] args) {
		
		int [] arr1= {2,9,8,5};
		int [] arr2= {2,8,9,5};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		boolean flag=false;
		
		if(len1==len2)
		{
			for(int i=0;i<=len1-1;i++)
			{
					if(arr1[i]!=arr2[i])
					{
						flag=false; 
					}
					else
					{
						flag=true;
					}
			}
		}
		if(flag)
		{
			System.out.println("Array1 and Array2 are equal."); 
		}
		else
		{
			System.out.println("Array1 and Array2 are not equal.");
		}
	}
}
