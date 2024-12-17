package co.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestSortById {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(new Employee("d", 1, 2000));
		l.add(new Employee("c", 4, 5000));
		l.add(new Employee("b", 7, 3000));	
		l.add(new Employee("kapil", 1, 6000));
		l.add(new Employee("a", 1, 2000));

		EmployeeShortById eid = new EmployeeShortById();
		Collections.sort(l, eid);

		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

