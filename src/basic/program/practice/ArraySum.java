package basic.program.practice;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an array ::: ");
		int size = sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter Element in an array ::: ");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		long sum=0;
		
		for(int i:arr)
		{
			sum+=i;
		}
		
		System.out.println(sum);
	}
}
