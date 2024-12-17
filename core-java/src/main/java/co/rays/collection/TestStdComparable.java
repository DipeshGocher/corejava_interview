package co.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestStdComparable {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(new Student(4, "a"));
		list.add(new Student(2, "b"));
		list.add(new Student(3, "c"));
		list.add(new Student(1, "d"));
		
		Collections.sort(list);
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
