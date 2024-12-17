package co.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestTeaher {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(new Teacher(1, "a"));
		l.add(new Teacher(1, "x"));
		l.add(new Teacher(1, "f"));
		l.add(new Teacher(1, "b"));
		
		Collections.sort(l);
		
	Iterator it = l.iterator();
	
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
	}

}
