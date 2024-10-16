package co.rays.string;

public class CountAccuranceOfChar {

	public static void main(String[] args) {
		
		String name = "Dipesh Gocher";
		int count = 0;
		
		for(int i = 0; i<name.length(); i++) {
			
			char ch = name.charAt(i);
			
		String m =	String.valueOf(ch);
		
		if(m.matches("h")) {
			count++;
		}
		}
		System.out.println("h  : " + count);
	}
}
