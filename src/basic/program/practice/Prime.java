package basic.program.practice;

public class Prime {

	public static void main(String[] args) {
		
		int n=7;
		boolean prime= true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				prime=false;
				break;
			}
		}
		
		if(prime)
		{
			System.out.println("No  is prime");
		}
		else
		{
			System.out.println("No  is not prime");
		}
				
	}
}
