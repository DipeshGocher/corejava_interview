package co.rays.collection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestAddOffer {
	
	public static void main(String[] args) {
		
		Queue q1 = new ArrayBlockingQueue(2);
		q1.offer(1);
		q1.offer(2);
		q1.offer(3);
	//	q1.offer(null);   // nhi chlega
		
		System.out.println(q1);
		
		Queue q = new ArrayBlockingQueue(2);
		
		q.add(4);
		q.add(5);    // upper wala Queue chlega ye nhi chlega
		q.add(6);
//		q.add(7);
	System.out.println(q);
		
		// we use Iterator to iterate
		
//		Queue q2 = new PriorityQueue();
//		q2.offer(3);
//		q2.offer(4);
//		System.out.println(q2.poll());
	}

}
