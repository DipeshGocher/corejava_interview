package co.rays.thread;

public class JoinThread extends Thread{
	
	String name = null;
	
	public JoinThread(String name) {
		this.name = name;
	}

	public void run() {
		
		for(int i =1; i<=5; i++) {
			System.out.println(i + "=" + name);
		}
	}

}