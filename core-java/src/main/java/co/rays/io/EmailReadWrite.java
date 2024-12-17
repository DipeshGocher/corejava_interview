package co.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EmailReadWrite {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/ACER/OneDrive/Desktop/IO/BlankEmail.txt"));
		
		PrintWriter pw = new PrintWriter(new FileWriter("C:/Users/ACER/OneDrive/Desktop/IO/Email.txt"));
		
		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+" + "(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		String str = br.readLine();
		while(str != null) {
			if(str.matches(emailreg)) {
				pw.println(str);
			}
			str = br.readLine();
		}
			pw.close();
			br.close();
			System.out.println("hell");
		}
	}


