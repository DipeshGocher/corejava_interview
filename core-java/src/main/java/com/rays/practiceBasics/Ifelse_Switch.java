package com.rays.practiceBasics;

import java.util.Scanner;

public class Ifelse_Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();

//		if(i==1) {
//			System.out.println(" 1 is odd number");
//		} else if (i==2) {
//		 System.out.println("2 is even number");	
//		}else if (i==3) {
//			System.out.println("3 is odd number");
//		}else if (i==4) {
//			System.out.println("4 is even number");
//		} else {
//			System.out.println("Invailid Number");
//		}

		switch (i) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("thusday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		default:
			System.out.println("Invailid date");

		}
	}

}
