package basic.program;

public class ReverseString {

	public static void main(String[]s)
	{
	StringBuilder builder=new StringBuilder("Vivek Joshi");
	System.out.println("Reverse String  ::: " + builder.reverse());
	System.out.println("");
	reverseString();
	//revString();
	}
	
	static void reverseString()
	{
		String name="vvkkkvv";
		int length = name.length();
		System.out.println(length);
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{  
			rev=rev+name.charAt(i);
			System.out.print(name.charAt(i));
		}
		System.out.println("");
		
		if(name.equals(rev))
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
//		System.out.println(rev);
	}
	
	static void revString()
	{
		String name="joshi";
		int length = name.length();
		System.out.println(length);
		char[] charArray = name.toCharArray();
		String rev="";
		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
			
		}
	//	System.out.println(rev);
	}
}

	