package co.rays.string;

public class StringPrintWithoutName {
	
	public static void main(String[] args) {
		
		String name = "dipesh";
		
		char[] ch = name.toCharArray();
		
		for (char a = 'a'; a<='z'; a++) {
			int count = 0;
			
			for (char s : ch) {
				if(s == a) {
					count++;
				}
				
			}
			if(count == 0) {
				System.out.print(a);
			}
			
		}
	}

}
