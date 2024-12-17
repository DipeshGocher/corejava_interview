package co.rays.streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpNameTest {
	
	public static void main(String[] args) {
		
		List<Emp> l = new ArrayList();
		
		l.add(new Emp(1, "tip"));
		l.add(new Emp(4, "dip"));
		l.add(new Emp(6, "sip"));
		l.add(new Emp(8, "rip"));
		
		l.stream().sorted(Comparator.comparing(Emp::getName)).forEach(e ->
		System.out.println(e.getId() + "=" + e.getName()));
			
		}
		

}
