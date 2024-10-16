package com.rays.practiceBasics;

import java.util.Arrays;

public class Anagra {

	public static void main(String[] args) {
		
		String s = "dipesh";
		String r = "hsdipe";
		
		char []s1 = s.toCharArray();
		char[] r1 = r.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(r1);
		
		if(Arrays.equals(s1, r1)) {
			System.out.println(s+ " " + r + " is anagram ");
		} else {
			System.out.println(s+ " " + r + " is not anagram ");
		}
	}
}
