package co.rays.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		// list.add(null); // chlega
		// list.add("a"); // chlega

		System.out.println(list.get(2));
		System.out.println(list.hashCode());
		System.out.println(list.subList(1, 3));
		System.out.println(list.lastIndexOf(400));
		System.out.println(list.indexOf(200));
		System.out.println(list.size());
		System.out.println(list);

		System.out.println("+++++++++++++++++++++++");

		LinkedList l = new LinkedList();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		// l.add(null);

		System.out.println(l.get(1));
		System.out.println(l.subList(0, 3));
		System.out.println(l.element());
		System.out.println(l.getFirst());
		System.out.println(l.peek());
		System.out.println(l.peekFirst());
		System.out.println(l.pop());
		System.out.println(l);
		System.out.println(l.getLast());
		System.out.println(l.peekLast());

		System.out.println(l.offer(15));
		System.out.println(l.offerFirst(100));
		System.out.println(l.offerLast(500));
		System.out.println(l);

		System.out.println("---------------------------");

		Stack s = new Stack();

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		// s.push(null);

		System.out.println(s.remove(1));
		System.out.println(s);
		System.out.println(s.get(1));
		System.out.println(s.empty());
		System.out.println(s.peek());
		System.out.println(s.search(5));
		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
		System.out.println(s);

		System.out.println("=================");

		Vector v = new Vector();

		v.add(50);
		v.add(100);
		v.add(150);
		v.add(200);
		// v.add(null);

		System.out.println(v.get(2));
		System.out.println(v.contains(50));
		System.out.println(v.elementAt(2));
		System.out.println(v.subList(1, 3));
		System.out.println(v.hashCode());
		System.out.println(v.size());
		System.out.println(v.capacity());
	}

}
