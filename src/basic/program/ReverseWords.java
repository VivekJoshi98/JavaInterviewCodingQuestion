 package basic.program;

public class ReverseWords {

	static String reverseWords(String s)
    {
      String[] split = s.split(" +");
      
      StringBuilder sb=new StringBuilder();

      for(int i=split.length-1;i>=0;i--)
      {
    	 sb.append(split[i]);
    	 
             sb.append(" ");
             
      }
    
      
      return sb.toString().trim();
    }
	
	public static void main(String[] args) {
		
		String reverseWords = reverseWords("Hello World");
//		String rev="";
//		for(int i=reverseWords.length()-1;i>=0;i--)
//		{
//			rev=rev+reverseWords.charAt(i);
//		}
//		System.out.println(rev);
		System.out.println(reverseWords);
	}
}
