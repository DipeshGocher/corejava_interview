package co.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExitFileWriteLineByLine {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("C:\\Users\\ACER\\OneDrive\\Desktop\\IO\\scnaaer.txt", true);
		
		PrintWriter out = new PrintWriter(file);
		
		out.println("helo bhai");
		out.println("kkrh");
		out.close();
		
		file.close();
		System.out.println("successfully write data");
		
	}

}
