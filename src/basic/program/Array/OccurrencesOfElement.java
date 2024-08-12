package basic.program.Array;

import java.util.Scanner;

public class OccurrencesOfElement {

	// Find the occurence of an element
	public static void main(String[] args) {
         
		Scanner sc=new Scanner(System.in);
		 // Input array size
        System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		
		// Input array elements 
        System.out.println("Enter " + size + " integers:");
        
        for(int i=0;i<=arr.length-1;i++)
        {
        	arr[i]= sc.nextInt();
        }
        
        System.out.println("Enter Element to search : ");
        int search=sc.nextInt();
        
        
        
       int duplicateElement = duplicateElement(arr, search);
       System.out.println("The element " + search + " occurs " + duplicateElement + " times in the array.");
	}

	private static void occurence() {

		int[] arr = { 4, 4, 3, 5, 6, 7, 5, 3, 4, 4, 4, 2, 6, 7, 8, 8, 6, 4, 3, 4 };
		int count = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == 4) {
				count++;
			}

		}
		System.out.println("Occurence of " + "4" + " is " + count);
	}

	private static int duplicateElement(int []arr,int search) {
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==search)
			{
				count++;
			}
		}
		return count;
	}

}
