package co.rays.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EqualHashCodeTest1 {

	public static void main(String[] args) {

		EqualHashCode e1 = new EqualHashCode(100, "dip", 500);

		EqualHashCode e2 = new EqualHashCode(100, "dip", 500);

		EqualHashCode e3 = new EqualHashCode(200, "dip", 100);

		List l = new ArrayList();
		l.add(e1);
		System.out.println(l);

		l.remove(e2);
		System.out.println(l);

		System.out.println();
		Set s = new HashSet();
		s.add(e1);
		System.out.println(s);

		s.add(e2);
		System.out.println(s);

		s.add(e3);
		System.out.println(s);

		System.out.println();
		Map m = new HashMap();

		m.put(e1, 1);
		m.put(e2, 2);
		m.put(e3, 3);
		System.out.println(m);

		m.remove(e2, 2);
		System.out.println(m);

	}

}
