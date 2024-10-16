package co.rays.oop;

public class Account1 {
	
	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(int amt) {
		
      balance = balance + amt;
      
      System.out.println("balance " + balance);
	}
	
	public void withdrawl(int amt) {
		
		if ((balance - 2000) < amt) {
			System.out.println("low balance");
		} else {

			System.out.println("Total balance" + balance);
			System.out.println("Withdrawl Amt" + amt);
			balance = balance - amt;
			System.out.println("After Withdrawl Amt" + balance);
		}
		
	}
	
	public static void main(String[] args) {
		
		Account1 a1 = new Account1();
		a1.setBalance(11500);
		a1.deposit(500);
		a1.withdrawl(1000);
	}

}
