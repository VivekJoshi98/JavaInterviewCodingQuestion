package basic.program.Array;

public class SecondLargestElement {

	static void secondLargestElement() {

		int arr[] = { 1, 3, 2, 4, 5, 67, 7, 67 };

		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}

			if (i == 1) {
				break; // this line means it will sort till 1.
			}
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Second largest element in an array : " + arr[1]);
	} 
	//*******************************************************************************************
	
	
	static void secondHighest()
	{
		int arr[] = { 1, 3, 2, 4, 5, 67, 7, 67 };
		
		int highest=Integer.MIN_VALUE;
		int second_highest=Integer.MIN_VALUE;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>highest)
			{
				second_highest= highest;
				highest=arr[i];
			}
			else if(arr[i]<highest && arr[i]> second_highest)
			{
				second_highest=arr[i];
			}
		}
		
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println("Second largest element in an array : " + second_highest);
		
	}
	 
	 

	public static void main(String[] args) {

	//	secondLargestElement();
		secondHighest();
	}
}
