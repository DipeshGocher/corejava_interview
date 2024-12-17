package co.rays.thread;

public class TestPriorityThread {
	
	public static void main(String[] args) {
		
		PriorityThread t1 = new PriorityThread("dipesh");
		
		PriorityThread t2 = new PriorityThread("gocher");
		
		t1.setPriority(5);
		t2.setPriority(2);
//		t1.setPriority(Thread.MAX_PRIORITY);
//		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
	}

}
