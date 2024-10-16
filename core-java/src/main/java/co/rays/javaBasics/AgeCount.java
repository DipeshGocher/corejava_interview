package co.rays.javaBasics;

import java.time.LocalDate;
import java.time.Period;

public class AgeCount {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		LocalDate empbirth = LocalDate.of(2002, 07, 31);
		
		Period p = Period.between(empbirth, date);
		
		System.out.println("age : " + p.getYears());
	}

}
