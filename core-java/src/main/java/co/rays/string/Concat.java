package co.rays.string;

public class Concat {

	public static void main(String args[]) {

//		1st approach
		String a = "Rays ";
		String b = "Technologies ", c = "indore";
		

		System.out.println(a.concat(b).concat(c));
		
	//	2nd approach
		
		String d = a + b + c;
		System.out.println(d);
	}
	
	
}
