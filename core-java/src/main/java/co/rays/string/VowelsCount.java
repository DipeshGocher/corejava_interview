package co.rays.string;

public class VowelsCount {

	public static void main(String[] args) {

		String str = "Dipesh";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if (c == 'a' || c == 'e' || c == 'i'  || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				count++;
			}
			
		}
		
		System.out.println(count);
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if("aeiouAEIOU".indexOf(c)!= -1);
			System.out.print(c);
			
		}
	}
}

