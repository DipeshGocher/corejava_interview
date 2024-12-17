package co.rays.exception;

public class TryWithMultiCatchFinally {

	public static void main(String[] args) {

		String name1 = "abc";
		String name = null;
		try {
			System.out.println(name.length());
			System.out.println(name1.charAt(5));
		} catch (NullPointerException e) {
			System.out.println(e);
			// e.printStackTrace();
		} catch (StringIndexOutOfBoundsException s) {
			System.out.println(s);
		} finally {
			System.out.println("finally");
		}
	}
}
