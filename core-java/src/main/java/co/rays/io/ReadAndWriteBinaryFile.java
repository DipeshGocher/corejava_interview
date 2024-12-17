package co.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {

	public static void main(String[] args) throws IOException {

		
		String source = "C:/Users/ACER/OneDrive/Desktop/IO/dpicture.jpg";
		
		String target = "C:/Users/ACER/OneDrive/Desktop/IO/dd.jpg";
		
		FileInputStream in = new FileInputStream(source);
		
		FileOutputStream out = new FileOutputStream(target);
		
		int i= in.read();
		while(i  != -1) {
			
			out.write(i);
			i = in.read();
		}
		
		System.out.println("success");
	}
}
