package com.practice.practice100925;

import java.util.Scanner;

public class CountOccurrencesOfElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :: ");
		int size = sc.nextInt();
		int arr[]=new int[size];		
		
		System.out.println("Enter "+size+" integers :");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to search :: ");
		
		int search=sc.nextInt();
		
		countOccurrencesOfElement(arr,search);
	}

	private static void countOccurrencesOfElement(int[] arr, int search) {
		int count = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==search)
			{
				count++;
			}
		}
		
		System.out.println("The element " + search + " occurs " + count + " times in the array.");
		
	}
}
