package co.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLineText {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:/Users/ACER/OneDrive/Desktop/IO/dipesh.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		
		String str = br.readLine();
		
		while(str != null) {
			System.out.println(str);
			
			str = br.readLine();
		}
		fr.close();
		br.close();
	}

}
