package co.rays.oop;

public class Account {
	private double balance;

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposite(int amt) {
		System.out.println("total amount " + balance);
		System.out.println("depoit amount " + amt);
		balance = balance + amt;

		System.out.println("after deposit " + balance);

	}

	public void withdrawall(int amt) {
		if ((balance - 2000) < amt) {
			System.out.println("Low balance");
		} else {
			System.out.println("total balance " + balance);
			System.out.println("withdrawl amount " + amt);
			balance = balance - amt;
			System.out.println("after withdrawal " + balance);

		}
	}

	public static void main(String[] args) {
		Account t = new Account();
		t.setBalance(2000);
		t.deposite(1000);
		t.withdrawall(500);

	}
}
