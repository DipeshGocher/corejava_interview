package co.rays.collection;

import java.util.HashMap;

public class MapIterator {

	public static void main(String[] args) {

		HashMap m = new HashMap();

	
		m.put(1, "aaa");
		m.put(2, "bbb");
		m.put(3, "ccc");
		m.put(4, "ddd");
		m.put(4, null);     // chlega but values another 4 ki aayegi
		m.put(4, "abc");
		
		for(Object o : m.entrySet()) {
			
			System.out.println(o);
		//	System.out.println(m);
		}
		
	//	System.out.println(m);
		
		for(Object o : m.values()) {
			
			System.out.println(o);
		//	System.out.println(m);
		}
		
		
		for(Object o : m.keySet()) {
			
			System.out.println(o);
		//	System.out.println(m);
		}

	}

}
