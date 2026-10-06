package basic.program.ArrayPatternWise.PrefixSum;

public class FindPivotIndex {

	public static void main(String[] args) {
		int arr[] = { 1, 7, 3, 6, 5, 6 };
		solution(arr);
	}
	private static int solution(int arr[]) {
	
		int leftSum = 0, rightSum = 0;

		for (int i : arr) {
			rightSum += i;
		}

		for (int i = 0; i < arr.length; i++) {
 
			rightSum -= arr[i];

			if (rightSum == leftSum) {
				return i;
			}
 
			leftSum += arr[i];
		}
		return -1;
		
	}
}
