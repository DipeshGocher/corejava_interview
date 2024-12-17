package co.rays.collection;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class DequeInterface {
	
	public static void main(String[] args) {
		
		Deque d = new ArrayDeque();
		
		d.offer(80);
		d.offer(20);
		d.offer(10);
		d.offer(40);
		d.offer(50);
	//	d.offer(600);
	//	d.offer(null); // nhi chlega
	//	d.offer("a");  //  chlega
	//	d.add(21);    // chlega
		
	
	System.out.println(d.size());	
		// add element in first
		System.out.println(d.offerFirst(1));
		
		// add element in last
		System.out.println(d.offerLast(2));
		
		// show the first element
		// System.out.println(d.getFirst());
		System.out.println(d.peek());
		
		// show first element and remove it
		System.out.println();
		System.out.println(d.pop());
		System.out.println(d);
		System.out.println(d.poll());
		System.out.println(d.pollFirst());
		System.out.println(d);
	}

}
