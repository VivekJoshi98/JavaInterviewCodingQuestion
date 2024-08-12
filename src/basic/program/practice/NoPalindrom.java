package basic.program.practice;

public class NoPalindrom {

	public static void main(String[] args) {
		
		int n=112211,rev=0,r,orig=n;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		
//		System.out.println(rev);
		
		if(orig==rev)
		{
			System.out.println("No is Palindrom");
		}
		else
		{
			System.out.println("No is not Palindrom");
		}
		
		
		
	}
}
