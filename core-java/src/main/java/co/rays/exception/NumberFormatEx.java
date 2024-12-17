package co.rays.exception;

public class NumberFormatEx {
	
	public static void main(String[] args) {
		
		String s = "Dipesh12";
		try {
			int i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}

}
