package co.rays.thread;

public class TestRacing {
	
	public static void main(String[] args) {
		
		Racing r1 = new Racing("dip");
		Racing r2 = new Racing("Gocher");
		
		r1.start();
		r2.start();
	}

}
