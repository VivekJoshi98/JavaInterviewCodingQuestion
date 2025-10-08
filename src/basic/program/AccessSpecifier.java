package basic.program;

public class AccessSpecifier {

	private int e=50;// private work with in class
	public static void main(String[] args) {
		AccessSpecifier as=new AccessSpecifier();
		Abc c1=new Abc();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
	//	System.out.println(c1.d);
		System.out.println(as.e);
	}
}

class Abc{ 
	
	public int a=10;
	protected int b=20;
	int c=30;
	private int d=40;
}
