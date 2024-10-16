package co.rays.string;

public class TextFileFound {
	
	public static void main(String[] args) {
		
		String[] arr = {"hello.txt", "hindi.txt", "spring.java", "abc.python" };
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i].endsWith(".txt")) {
				System.out.println(arr[i]);
				
			}
//			
//			if (arr[i].startsWith("h")) {
//				System.out.println(arr[i]);
//				
//			}
		}
	}

}
