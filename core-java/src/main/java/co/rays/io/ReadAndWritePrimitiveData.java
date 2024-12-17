package co.rays.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class ReadAndWritePrimitiveData {
	
	public static void main(String[] args) throws IOException{

		DataOutputStream out  = new DataOutputStream(new FileOutputStream("C:/Users/ACER/OneDrive/Desktop/IO/dipesh.txt"));
		
		out.writeInt(10);
		out.writeBoolean(true);
		out.writeDouble(45.25);
		out.writeFloat(2.2F);
		out.writeChar('a');
		
		out.close();
		
		System.out.println("data added....");
		
		DataInputStream in = new DataInputStream(new FileInputStream("C:/Users/ACER/OneDrive/Desktop/IO/dipesh.txt"));
		
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readDouble());
		System.out.println(in.readFloat());
		System.out.println(in.readChar());
		
		in.close();
		
			
	
	
	}
}
