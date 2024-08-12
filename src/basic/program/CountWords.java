package basic.program;

public class CountWords {

	public static void main(String[] args) {
		
		String words=new String("My name is Vivek Joshi");
		String[] split = words.split("\\s");
		int length = split.length;
		System.out.println(length);
	}
}
