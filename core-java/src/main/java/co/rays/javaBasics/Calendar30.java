package co.rays.javaBasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar30 {
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		for(int i = 1; i<=3; i++) {
			c.add(Calendar.DATE, 30);
		
			System.out.println(c.getTime());
	}	
			
		//	2nd qproach
			// format change
			
//			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//			String date = sdf.format(c.getTime());
//			System.out.println(date);
//			
			
	}	
	}


