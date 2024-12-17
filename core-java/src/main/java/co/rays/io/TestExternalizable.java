package co.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalizable {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		StudentExternalizable s = new StudentExternalizable(10, "dip");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ACER\\OneDrive\\Desktop\\IO\\StudentExternalizable.txt"));
		
		out.writeObject(s);
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\ACER\\OneDrive\\Desktop\\IO\\StudentExternalizable.txt"));
		
		s = (StudentExternalizable) in.readObject();
	
		System.out.println(s.getId());
		System.out.println(s.getName());
	
		out.close();
		in.close();
	}

}
