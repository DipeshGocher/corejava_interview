
package co.rays.oop;

public class TestAccount1 {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setBalance(1000);
		
		System.out.println(a.getBalance());
		
		a.deposite(5000);
		
		a.withdrawl(4001);
		
	}

}
