package co.rays.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ArrayBlockingQueue;

public class ListIteratort {

	public static void main(String[] args) {

		List l = new ArrayList();
	//	ArrayBlockingQueue l = new ArrayBlockingQueue(4);
		l.add(10);
		l.add(12);
		l.add("dipesh");
		l.add("gocher");
	//	l.add(null);     // chlega

		ListIterator it = l.listIterator();
		l.add("v");    // exception
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
