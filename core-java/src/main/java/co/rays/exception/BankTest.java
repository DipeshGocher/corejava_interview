package co.rays.exception;

public class BankTest {

	public static void main(String[] args) {

		BankAccount a = new BankAccount();

		a.setBalance(2000);
		System.out.println("total balance " + a.getBalance());
		a.deposite(100);
		// System.out.println("after deposit" + a.getBalance());
		System.out.println("After deposite " + a.getBalance());

		try {
			a.withdrawl(500);

			System.out.println("After withdrawl " + a.getBalance());
		} catch (BankException e) {
			// System.out.println("Amount is less than 2000");
			System.out.println(e);

		}
	}

}
