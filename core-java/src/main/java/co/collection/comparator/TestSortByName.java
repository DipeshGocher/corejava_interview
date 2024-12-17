package co.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestSortByName {
	
	public static void main(String[] args) {
		List l = new ArrayList();

		l.add(new Employee("d", 1, 2000));
		l.add(new Employee("c", 3, 1000));
		l.add(new Employee("b", 2, 3000));
		l.add(new Employee("c", 5, 1000));
		l.add(new Employee("a", 6, 2000));

		EmployeeShortByName e = new EmployeeShortByName();
		Collections.sort(l, e);
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}


}
