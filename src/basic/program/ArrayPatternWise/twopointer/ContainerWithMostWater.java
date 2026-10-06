package basic.program.ArrayPatternWise.twopointer;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
//		int ans = containerWithMostWater(arr);
//		System.out.println(ans);

		int ans = containsMostWater(arr);
		System.out.println(ans);

	}
//-----------------------------------------------------------------------------------------

	private static int containerWithMostWater(int[] arr) { // Brute force approach

		int maxWater = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				int width = j - i;
				int height = Math.min(arr[i], arr[j]);
				int area = width * height;

				maxWater = Math.max(maxWater, area);
			}
		}

		return maxWater;
	}
//-------------------------------------------------------------------------------------------

	private static int containsMostWater(int[] arr) {// Optimized approach using two pointer
		
		int maxWater=0;
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right)
		{
		int width=right-left;
		int height=Math.min(arr[left], arr[right]);
		int area=width*height;
		
		maxWater=Math.max(maxWater, area);
		
		if (arr[left]<arr[right])
			left++;
		else
			right--;
		
		}
		return maxWater;
		
		
	}
}