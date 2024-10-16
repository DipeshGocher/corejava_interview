package co.rays.oop;

public final class ImmutableClass {

	private final int number;

	public ImmutableClass(int number) {
		this.number = number;

	}

	public int getNumber() {
		return number;
	}

	public static void main(String[] args) {

		ImmutableClass c = new ImmutableClass(5);
		System.out.println(c.getNumber());
	}
}
