package co.rays.string;

import java.util.Arrays;

public class HoldInIntegerArray {

	public static void main(String[] args) {

		String name = "Dipesh123Goc4her";
		
		String result = "";

		char[] ch = name.toCharArray();

		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(ch[i])) {
				result = result + ch[i];
				
			}
		}
		
//         convert numeric result String to int array
		int[] intArray = new int[result.length()];
		for (int i = 0; i < result.length(); i++) {
			intArray[i] = Character.getNumericValue(result.charAt(i));
		}
		// System.out.println(intArray[i]);
		System.out.println(Arrays.toString(intArray));
		}
	}
