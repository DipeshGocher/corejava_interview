package co.rays.networking;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLWriter {

	public static void main(String[] args) throws Exception {

		URL url = new URL("https://erp.sunilos.com/NCSA/#/Test");

		String question = "java";

		URLConnection conn = url.openConnection();

		conn.setDoOutput(true);

		OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());

		out.write("q=" + question);

		out.close();

		conn.connect();

		InputStream iStr = conn.getInputStream();

		Scanner in = new Scanner(iStr);

		System.out.print("URL contents ***");

		while (in.hasNext()) {
			String html = in.nextLine();
			System.out.println(html);
		}

		in.close();

	}

}
