package basic.program.ArrayPatternWise.Kadanes;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		int[] arr= {2,3,-2,4};
		int bruteForce = bruteForce(arr);
		System.out.println(bruteForce);
		
		optimized(arr);
		
			
	}

	private static void optimized(int[] arr) {
		// TODO Auto-generated method stub
		
	}

	private static int bruteForce(int[] arr) {
		int maxProduct=arr[0];
		for (int i = 0; i < arr.length; i++) {
			int product=1;
			for (int j = i; j < arr.length; j++) {
				
				product*=arr[j];
				maxProduct=Math.max(maxProduct, product);
			}
		}
		return maxProduct;
	}
	
	
	
}

  
