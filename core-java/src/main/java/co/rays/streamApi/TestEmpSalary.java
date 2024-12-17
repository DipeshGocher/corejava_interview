package co.rays.streamApi;

import java.util.ArrayList;
import java.util.List;

public class TestEmpSalary {
	
	public static void main(String[] args) {
		
		List<EmployeeSalary> list = new ArrayList<EmployeeSalary>();
		
		list.add(new EmployeeSalary(20000, "dipesh"));
		list.add(new EmployeeSalary(25000, "Gocher"));
		list.add(new EmployeeSalary(1000, "Ravi"));
		list.add(new EmployeeSalary(500, "Mehta"));
		list.add(new EmployeeSalary(610, "Kashyap"));
		
		list.stream().distinct().filter(c ->
		( c.getSalary() >= 20000)).forEach(c -> 
		System.out.println(c.getSalary() + "=" + c.getName()));
	}

}