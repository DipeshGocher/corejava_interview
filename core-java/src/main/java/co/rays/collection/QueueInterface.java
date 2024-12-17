package co.rays.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	
	public static void main(String[] args) {
		
		Queue q = new PriorityQueue();
		
		q.offer(100);
		q.offer(200);
		q.offer(300);
		q.offer(400);
	//	q.offer(null);           // nhi chlega
		q.offer("a");// nhi chlega
		q.add(500);
		
		
		// show first element
		System.out.println(q.element());
	//	System.out.println(q.peek());
		
		// show first then remove
		System.out.println(q.poll());
	//	System.out.println(q.remove());
		
		// return true then remove
		System.out.println(q.remove(200));
		System.out.println(q);
	}

}
