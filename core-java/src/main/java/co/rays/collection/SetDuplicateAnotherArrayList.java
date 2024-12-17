package co.rays.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDuplicateAnotherArrayList {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(2);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(3);
	//	list.add("abc");   // chlega
	//	list.add(null);    // chlega

		Set unique = new HashSet();
		Set duplicate = new HashSet();
		for (Object o : list) {
			if (!unique.add(o)) {
				duplicate.add(o);
			}

		}

		List duplicateList = new ArrayList(duplicate);
		List original = new ArrayList(unique);
		System.out.println("original List : " + list);
		System.out.println("Unique List : " + original);
		System.out.println("Duplicate List : " + duplicateList);
	}

}
