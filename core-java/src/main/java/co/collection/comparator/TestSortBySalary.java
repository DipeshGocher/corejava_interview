package co.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestSortBySalary {
	
	public static void main(String[] args) {
		List l = new ArrayList();

		l.add(new Employee("a", 1, 2000));
		l.add(new Employee("d", 3, 2000));
		l.add(new Employee("c", 2, 1000));
		l.add(new Employee("m", 6, 2000));
		l.add(new Employee("b", 5, 2000));

		EmployeeSortBySalary e = new EmployeeSortBySalary();
		Collections.sort(l, e);
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}


}
