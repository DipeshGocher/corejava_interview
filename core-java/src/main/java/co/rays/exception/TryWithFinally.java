package co.rays.exception;

public class TryWithFinally {
	
	public static void main(String[] args) {
		
		String s = "Dipesh";
		try {
			 
			System.out.println(s.charAt(10));
		//	 s.charAt(10);
			//System.exit(0);
			System.out.println("try");
			
		} finally {
			System.out.println("End of program");
			
		}
		
	}

}
