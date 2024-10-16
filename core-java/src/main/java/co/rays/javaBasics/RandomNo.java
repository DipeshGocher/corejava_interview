package co.rays.javaBasics;

public class RandomNo {
	
	public static void main(String[] args) {
		
		for(int i = 1; i<=5; i++) {
			int a = (int)(Math.random() * 10000 + 9999);
			System.out.println(a);
		}
	}

}
