package co.rays.string;

public class CountAccuranceOfArray {
	
	public static void main(String[] args) {
		
		String [] str = { "abcd","bcdae"};
		
		for (char a = 'a'; a <='z'; a++) {
			int count = 0;
			for (String s : str) {
				
				for (int i = 0; i < s.length(); i++) {
					if(a == s.charAt(i)) {
						count++;
					}
					
				}
				
			}
			if(count>0) {
				System.out.println(a + " : " + count);
			}
		}
		
		}
	}


