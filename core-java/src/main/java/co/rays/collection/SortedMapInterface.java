package co.rays.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterface {

	public static void main(String[] args) {

		SortedMap s = new TreeMap();
		s.put(1, "aaa");
		s.put(2, "bbb");
		s.put(3, "ccc");
		s.put(4, "ddd");

		System.out.println(s.get(4));
//		System.out.println(s.lastKey());
//		System.out.println(s.firstKey());
		System.out.println(s.tailMap(3));
		System.out.println(s.entrySet());
		System.out.println(s.subMap(1, 3));
		System.out.println(s.keySet());
		System.out.println(s.values());
		
	}

}
