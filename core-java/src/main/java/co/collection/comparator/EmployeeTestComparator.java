package co.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeTestComparator {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(new Employee("kapil", 3, 2000));
		l.add(new Employee("a", 1, 1000));
		l.add(new Employee("b", 2, 3000));
		l.add(new Employee("c", 1, 5000));
		l.add(new Employee("a", 5, 2000));

		EmployeeShortByName byName = new EmployeeShortByName();

		Collections.sort(l, byName);

		System.out.println("short by name");

		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("--------------------");
		
		EmployeeShortById byId = new EmployeeShortById();
		
		Collections.sort(l, byId);
		
		System.out.println("Sort by Id");
		
		Iterator it1 = l.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
	
	

}
