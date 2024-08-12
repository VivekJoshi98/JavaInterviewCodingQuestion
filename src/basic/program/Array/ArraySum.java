package basic.program.Array;

import java.util.Scanner;

public class ArraySum {

	public static void main(String []s)
	{
	//	int arr[]= {1,2,4,4,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		
		int arr[] =new int[size];
		
		System.out.println("Enter the element : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
	    long sum=0;
	    System.out.println("********************************************");
	    System.out.println("Traversing element Using for each loop ");
		for(int i :arr)
		{
			sum=sum+i;
			System.out.println(" "+i);
		}
		 System.out.println("********************************************");
			/*
			 * System.out.println("Traversing element Using for loop "); for(int
			 * i=0;i<arr.length;i++) { sum=sum+arr[i]; System.out.println(" "+arr[i]); }
			 */
	    System.out.println("********************************************");
		System.out.println("Sum of array is "+sum );
	}
	
}
