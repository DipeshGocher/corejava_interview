package co.rays.streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpIdTest {
	
	public static void main(String[] args) {
		
		List<Emp> l = new ArrayList();
		
		l.add(new Emp(1, "dip"));
		l.add(new Emp(4, "singh"));
		l.add(new Emp(3, "ram"));
		l.add(new Emp(5, "mehta"));
		
		l.stream().sorted(Comparator.comparingInt(Emp::getId)).forEach(e ->
		System.out.println(e.getId() + "=" + e.getName()));
	}

}
