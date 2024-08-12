package basic.program.Array;

import java.util.HashSet;

public class CommonElementBetweenTwoArray {

	public static void main(String[] args) {
		int [] arr1= {1,2,3,4,5,6,7,8};
		int [] arr2= {5,2,3,7,8};
		
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				if(arr1[i]==arr2[j])
				{
					hs.add(arr1[i]);
					break;
				}
			}
		}
		for(int element:hs)
		{
			System.out.println (element+" ");
		}
	}
}
