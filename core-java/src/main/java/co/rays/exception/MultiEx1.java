package co.rays.exception;

public class MultiEx1 {

	public static void main(String[] args) {

		String[] number = { "10", "0", "Dip1" };

		for (String num : number) {
			try {
				int n = 10;
				int d = Integer.parseInt(num);

				int result = n / d;
				// System.out.println(result);
			} catch (ArithmeticException | NumberFormatException e) {
				System.out.println(e);
			}
		}
	}
}