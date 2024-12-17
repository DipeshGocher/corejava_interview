package co.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
	//	v.add(null);    // chlega

		Enumeration e = v.elements();
		v.add(5);
		v.remove(3); // Remove a element of given index

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());

		}
	}

}
