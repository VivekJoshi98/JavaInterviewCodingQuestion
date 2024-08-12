package basic.program.Array;

import java.util.Arrays;

public class CycalicallyRotateArray { //

	public static void main(String[] args) {
		
		//rotateArrayByOne();
 		rotateArrayByGivenNo();

	}
	
	public static void rotateArrayByOne() {
	
		int arr[]= {1,2,3,4,5};
		int x=arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=x;
		
		for(int a:arr)//iterate using for each loop 
		{
			System.out.println("arr["+a+"] ");
		}
//		for(i=0;i<=arr.length-1;i++)
//		{
//			System.out.println("arr["+i+"] "+arr[i]);
//		}
		
	}
	
	public static void rotateArrayByGivenNo()
	{
		int arr[]= {1,2,3,4,5,6,7};
		int i,k=3;
		
		for(int j=1;j<=k;j++)
		{
			int x=arr[arr.length-1];
			for(i=arr.length-1;i>0;i--)
			{
				arr[i]=arr[i-1];
				System.out.println(Arrays.toString(arr));
			}
			arr[0]=x;
			System.out.println(Arrays.toString(arr));
		}
		
		for(i=0;i<=arr.length-1;i++)
		{
			System.out.println("arr["+i+"] "+arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}
}
