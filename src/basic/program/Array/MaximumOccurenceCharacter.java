package basic.program.Array;

public class MaximumOccurenceCharacter {

	public static void main(String[] args) {
		String str="abbccc";
		System.out.println("String is : "+str);
		str=str.replaceAll("\\s", "");
		String s = str.toLowerCase();
		  
		int[] arr=new int[127];
		
	//	System.out.println(" -- "+arr);
		for(int i=0;i<=s.length()-1;i++)
		{
			arr[s.charAt(i)]=arr[s.charAt(i)]+1;
		}
		
		int max=-1;
		char c=' ';
		for(int i=0;i<=s.length()-1;i++)
		{
		 if(max<arr[s.charAt(i)])
		 {
			 max=arr[s.charAt(i)];
			 c=s.charAt(i);
//			 System.out.println(c);
 
		 }
		}
		 System.out.println("Maximum Occurrence of char is: " + c);
		
	}
}
