package co.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadCharByCharText {
	
	public static void main(String[] args)  throws IOException{
		
		FileReader file = new FileReader("C:/Users/ACER/OneDrive/Desktop/IO/dipesh.txt");
		
		int i = file.read();
		
		while(i != -1) {
			
			System.out.println((char) i);
			
			i = file.read();
		}
		file.close();
	}
	

}
