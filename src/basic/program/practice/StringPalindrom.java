package basic.program.practice;

public class StringPalindrom {

	public static void main(String[] args) {
		
		String str="viv",rev="",orig=str;
	
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Reverse :: "+rev);
		
		if(orig.equals(rev))
		{
			System.out.println("String is palindrom");
		}else
		{
			System.out.println("String is not palindrom");
		}
	}
}
