package basic.program.Array;

public class ReverseTheArray {

	public static void main(String[] args) {
		
		 int[] arr= {10,20,30,40,50}; // initialize an array
		 
		 int [] reverseArray = new int [arr.length]; // initialize blank array with size of arr.
		 
		 int index=0;
		 
		 for(int i=arr.length-1;i>=0;i--)
		 {
			 reverseArray[index] = arr[i];
			 index++;
			 
		 }
		 
		 for(int rev:reverseArray)
		 {
			 System.out.print(rev+" ");
		 }

	}

}
