package com.rays.practiceBasics;

public class BasicStrings {

	public static void main(String[] args) {
		
// String Are Immutable : ek bar String memory me save ho gyi to change nhi kr skte		

		// abc.length() : it counts length of string example: 12,5 etc

		String name1 = "Dipesh";
		String name2 = "Gocher";
		String fullName = name1 + " " + name2;
		 System.out.println(fullName);
	     System.out.println(name1.length());

		
		
//    for loop fullName ki length tk chalega 
//	  char.At() : one by one letters me todta hai Strings ko

//	for(int i = fullName.length()-1; i>=0; i--) {
//		System.out.print(fullName.charAt(i));
//		System.out.print(" ");
//	}

		
		
//		compare 2 Strings

//		String name1 = "Bello";
//		String name2 = "Cello";
//		if (name1.compareTo(name2) == 0) {
//			System.out.println("String are equal");
//		} else {
//			System.out.println("String are not Equal");
//		}

	}

}
