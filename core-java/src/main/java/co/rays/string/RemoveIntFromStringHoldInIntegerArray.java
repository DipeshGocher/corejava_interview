package co.rays.string;

import java.util.Arrays;

public class RemoveIntFromStringHoldInIntegerArray {

	public static void main(String[] args) {

		String name = "r1a2y tec4hno3log";
		String result = "";

		char[] ch = name.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (Character.isDigit(ch[i])) {

				result = result + ch[i];
			}
		}

		char[] x = result.toCharArray();
		System.out.println(Arrays.toString(x));
	}

}
