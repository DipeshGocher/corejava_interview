package co.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\ACER\\OneDrive\\Desktop\\IO\\gocher1.txt");
		
				BufferedReader br = new BufferedReader(new FileReader("C:/Users/ACER/OneDrive/Desktop/IO/gocher2.txt"));
		
		String s1 = br.readLine();
		while(s1 != null) {
			fw.write(s1);
			
			s1 = br.readLine();
		}
		br.close();
		
		br = new BufferedReader(new FileReader("C:/Users/ACER/OneDrive/Desktop/IO/gocher3.txt"));
		
		String s2 = br.readLine();
		
		while(s2 != null) {
			fw.write(s2);
			
			s2 = br.readLine();
		}
		br.close();
		fw.close();
		
		System.out.println("succ");
	}

}
