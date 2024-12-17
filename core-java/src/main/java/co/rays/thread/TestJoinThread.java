package co.rays.thread;

public class TestJoinThread {
	
	public static void main(String[] args) {
		
		JoinThread t1 = new JoinThread("abc");
		JoinThread t2 = new JoinThread("xyz");
		
		t1.start(); // start t1 first
		
		try {
			t1.join(); // wait for t1 to complete
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();   // start t2 after t1 complete
	}
	
	

}
