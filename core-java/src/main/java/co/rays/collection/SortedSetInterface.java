package co.rays.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {
	
	public static void main(String[] args) {
		
		// Create a TreeSet Object that implements SortedSet
		
		SortedSet s = new TreeSet();
		// Add elements to the TreeSet
		
		s.add(100);
		s.add(20);
		s.add(300);
		s.add(400);
		s.add(500);
		s.add(100);
		
		
		// print the smallest element
		// output 20
		System.out.println(s.first());
		
		// print the largest element
		// output 500
		System.out.println(s.last());
		
		// print the size
		// output 5
		System.out.println(s.size());
		
		// print a view of set from 200 to end
		// output [300, 400, 500]
		System.out.println(s.tailSet(200));
		
		// print a view of set from the beginning to 400
		// output [20, 100, 200, 300]
		System.out.println(s.headSet(400));
		System.out.println(s);
		
	}

}
