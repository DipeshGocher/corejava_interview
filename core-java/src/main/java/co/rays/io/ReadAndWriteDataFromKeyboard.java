package co.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadAndWriteDataFromKeyboard {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		FileWriter fw = new FileWriter("C:\\Users\\ACER\\OneDrive\\Desktop\\IO\\dipesh", true);

		System.out.println("enter here.....");

		String str = br.readLine();

		while (str != null) {
	//	while(!str.equals("bye")) {
			fw.write(str);

			System.out.println(str);
			str = br.readLine();
			
		}
		br.close();
	}

}
