package co.rays.javaBasics;

public class CountNoOfInt {

	public static void main(String[] args) {
		
		int [] arr = { 1, 3, 99, 7, 76 };
		int num = 99;
		int temp = -1;
		
		for(int i = 0; i<arr.length; i++) {
			
			if(num == arr[i]) {
				temp = i;
			}
		}
		System.out.println(temp);
	}}