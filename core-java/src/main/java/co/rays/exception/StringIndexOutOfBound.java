package co.rays.exception;

public class StringIndexOutOfBound {
	
	public static void main(String[] args) {
		
		String s = "Dipesh";
		
		try {
			
				System.out.println(s.charAt(10));
				// System.out.println(s.charAt(2));
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
