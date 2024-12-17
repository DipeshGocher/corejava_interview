package co.rays.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {

		HashMap m = new HashMap();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		m.put(4, "d");
		m.put(5, "e");

		System.out.println(m.size());// 5
		System.out.println(m.isEmpty());
		System.out.println(m.get(5));

		System.out.println(m.containsKey(4));
		System.out.println(m.containsValue("d"));

		System.out.println("=========================");

		TreeMap t = new TreeMap();

		t.put(1, "dipesh");
		t.put(2, "gocher");
		t.put(3, "rinku");
		t.put(4, "dd");
		t.put(5, "gg");

		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		System.out.println(t.firstEntry());
		System.out.println(t.lastEntry());
		System.out.println(t.size());
		System.out.println(t.keySet());
		System.out.println(t.values());

		System.out.println(">>>>>>...");

		LinkedHashMap l = new LinkedHashMap();

		l.put(1, "aaaa");
		l.put(2, "bbbb");
		l.put(3, "cccc");
		l.put(4, "dddd");
		l.put(5, "eeee");

		System.out.println(l.get(2));
		System.out.println(l.containsKey(3));
		System.out.println(l.containsValue("bbbb"));
		System.out.println(l.keySet());
		System.out.println(l.values());

	}

}
