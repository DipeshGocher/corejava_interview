package co.rays.exception;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {

		String[] a = { "Dipesh", "kapil", "suraj" };

		try {

			// System.out.println(a[11]);
			System.out.println(a[5]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e);
		}
	}

}
