package co.rays.javaBasics;

public class ArmStrongNo {

	public static void main(String[] args) {
		
		int num = 153;
		int num2 = num;
		int r = 0;
		int temp = 0;
		
		while(num2 != 0) {
			r = num2 % 10;
			temp = temp + r * r * r;
			 num2 = num2/10;
			
		}
		if(temp == num) {
			System.out.println(num +" is arm strong no");
		}else {
			System.out.println(num + "not arm strong no");
		}
	}
}
