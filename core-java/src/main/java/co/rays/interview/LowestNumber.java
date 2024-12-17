package co.rays.interview;

public class LowestNumber {

	public static void main(String[] args) {

		int[] num = { 11, 76, 98, 13, 87, 12, 9, };
		int b = num[0];

		for (int i = 1; i < num.length; i++) {

			if (b > num[i]) {
				b = num[i];
			}
		}
		System.out.println("minimum value " + b);
	}

}
