package co.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestSortByIdName {

//	public static void main(String[] args) {
//
//		List l = new ArrayList();
//
//		l.add(new Employee(2, "v", 1000));
//		l.add(new Employee(5, "s", 8000));
//		l.add(new Employee(3, "b", 3000));
//		l.add(new Employee(1, "l", 5000));
//		l.add(new Employee(4, "w", 6000));
//
//		EmployeeShortByIdName e = new EmployeeShortByIdName();
//
//		Collections.sort(l, e);
//
//		Iterator it = l.iterator();
//
//		while (it.hasNext()) {
//			System.out.println(it.next());
//
//		}
//	}
//	
	public static void main(String[] args) {
		List l = new ArrayList();

		l.add(new Employee("d", 1, 2000));
		l.add(new Employee("c", 1, 1000));
		l.add(new Employee("b", 1, 3000));
		l.add(new Employee("c", 1, 1000));
		l.add(new Employee("a", 1, 2000));

		EmployeeShortByIdName e = new EmployeeShortByIdName();
		Collections.sort(l, e);
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
