package co.rays.javaBasics;

public class SwitchCalendar {

	public static void main(String[] args) {

		int i = 2;

		switch (i) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
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
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("please enter right digit");
		}
	}
}



