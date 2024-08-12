package basic.program;

public class WayOfCreatingObject {

// using new keywords	
	String name="vivek joshi";
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		/*  using newInstance
		 * try { Class<?> c=Class.forName("WayOfCreatingObject"); WayOfCreatingObject
		 * object=(WayOfCreatingObject) c.getConstructor(String.class).newInstance();
		 * 
		 * System.out.println(object.name); } catch (Exception e) { e.printStackTrace();
		 * }
		 */
		
		WayOfCreatingObject object=new WayOfCreatingObject();
		WayOfCreatingObject clone = (WayOfCreatingObject) object.clone();
		System.out.println(clone.name);
	}
}