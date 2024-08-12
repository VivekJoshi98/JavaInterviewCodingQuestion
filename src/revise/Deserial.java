package revise;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {

	public static void main(String[] s) throws IOException, ClassNotFoundException
	{
		FileInputStream fileInputStream=new FileInputStream("C:\\Users\\srs vivek joshi\\eclipse-workspace\\Serialization\\abc.txt");
		ObjectInputStream inputStream= new ObjectInputStream(fileInputStream);
		
	//	Student student=new Student();
		inputStream.readObject();
		System.out.println(inputStream.readObject());
		
		fileInputStream.close();
		inputStream.close();
	}
}
