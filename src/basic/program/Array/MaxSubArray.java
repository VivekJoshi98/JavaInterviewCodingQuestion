package basic.program.Array;

public class MaxSubArray {

	public static void main(String[] args) {
	// find the subArray with the largest sum, and return its sum.
		
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		
		int max_sum=arr[0];
		int sum=0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			sum+=arr[i];
			System.out.println(sum);
			if(sum>max_sum)
				max_sum=sum;
			if(sum<0)
				sum=0;
		}
		System.out.println("-----------------"+max_sum);
		

	}

}
