package basic.program;

public class SumOfArrayElement {
	public static void main(String[] args) {
		
		int [] arr= {1,5,3,6,7,8};
		int sum=0;
		for(int a:arr)
		{
			sum+=a;
					
		}
		System.out.println("Sum of the array element is "+sum);
		
	}
}
