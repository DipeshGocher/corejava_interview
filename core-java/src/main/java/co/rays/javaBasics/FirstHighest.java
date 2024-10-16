package co.rays.javaBasics;

public class FirstHighest {

	public static void main(String[] args) {

		int[] num = { 12, 54, 465, 45, 564 };
		int b = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] > b) {
				b = num[i];
			}

		}
		System.out.println(b);

	}
}
