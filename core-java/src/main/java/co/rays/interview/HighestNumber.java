package co.rays.interview;

public class HighestNumber {
	public static void main(String[] args) {

		int[] num = { 2, 77, 89, 756, 21, 90, 66 };
		int b = 0;

		for (int i = 1; i < num.length; i++) {
			
			if(b < num[i]) {
				b = num[i];
			}
		}
		System.out.println(b);

			
}
}