package co.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestSortByIdNameSalary {
	
	public static void main(String[] args) {
		List l = new ArrayList();

		l.add(new Employee("d", 1, 2000));
		l.add(new Employee("d", 1, 8000));
		l.add(new Employee("d", 1, 3000));
		l.add(new Employee("d", 1, 1000));
		l.add(new Employee("d", 1, 2000));

		EmployeeSortByIdNameSalary e = new EmployeeSortByIdNameSalary();
		Collections.sort(l, e);
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}



}
