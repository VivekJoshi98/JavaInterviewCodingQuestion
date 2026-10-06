package basic.program.ArrayPatternWise.twopointer;

public class TrappingRainwater {

	public static void main(String[] args) {
		
		trappingWater();
	}

	private static void trappingWater() {
		// Brute force approach
		int[] arr= {0,1,0,2,1,0,1,3,2,1,2,1};
		int totalWater=0;
		
		for (int i = 1; i < arr.length-1; i++) {
			
			// Find the max height to the left
			int leftMax=0;
			for (int j = 0; j < i; j++) {
				leftMax=Math.max(leftMax, arr[j]);
			}
			
			// Find the max height to the left
			
			int rightMax=0;
			for (int j = i+1; j < arr.length; j++) {
				rightMax=Math.max(rightMax, arr[j]);
			}
			
			
			totalWater=totalWater+Math.min(leftMax, rightMax)-arr[i];	
		}	
		System.out.println(totalWater);
		
	}
}
