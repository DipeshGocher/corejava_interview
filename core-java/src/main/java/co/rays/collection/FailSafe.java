package co.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafe {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add(2);
		v.add('b');
		v.add('c');
		v.add('d');
		v.add('e');
	//	v.add(null);     // chlega

		Enumeration e = v.elements();

		v.add(1);
		v.remove(2);

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());

		}

	}

}