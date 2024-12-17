package co.rays.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetIterator {

	public static void main(String[] args) {

		HashSet s = new HashSet();
		s.add(100);
		s.add(700);
		s.add(300);
		s.add(200);
		s.add(600);
	//	s.add(null);   // chlega 
		s.add("a");    // chlega
		
		Iterator it = s.iterator();
	//	System.out.println(it.hasNext());
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
