package co.rays.exception;

public class TryCatchFinally {

	public static void main(String[] args) {

		String name = null;
		try {

			System.out.println(name.length());

		} catch (NullPointerException e) {

			System.out.println(e);

		} finally {

			System.out.println("This is Finally Block");
		}
	}

}
