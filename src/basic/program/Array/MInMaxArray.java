package basic.program.Array;

public class MInMaxArray {

	public static void main(String[] args) {
		
		int[] arr= {9,4,5,2,5,3,2,2,8,1,10,0}; 
		int max = Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				 max = arr[i];
			//	 System.out.println(max);
			}
			if(arr[i]<min)
			{
				 min = arr[i];
			//	 System.out.println(max);
			}
			
		}
		System.out.println("----------------"+max);
		System.out.println("----------------"+min);

	}

}
