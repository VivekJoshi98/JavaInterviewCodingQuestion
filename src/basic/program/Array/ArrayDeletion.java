package basic.program.Array;

import java.util.Arrays;

public class ArrayDeletion {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		
		int indexpos=2;
		
		int[] newArray=new int[arr.length-1];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i==indexpos)
			{
				continue;
			}
			newArray[j]=arr[i];
			j++;
		}
		System.out.println(Arrays.toString(newArray));
	}
}
