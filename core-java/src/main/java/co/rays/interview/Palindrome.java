package co.rays.interview;

public class Palindrome {

	// A palindrome number is a number that reads the same backward as forward.
	public static void main(String[] args) {

		int num = 151;
		int r = 0;
		int temp = 0;
		int num2 = num;

		while (num2 != 0) {

			r = num2 % 10;
			temp = temp * 10 + r;
			num2 = num2 / 10;
		}
		if (temp == num) {
			System.out.println(num + " is palindrome number");
		} else {
			System.out.println("not palindrome");
		}

	}

}
