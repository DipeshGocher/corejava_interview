package co.rays.streamApi;

import java.util.Arrays;

public class MinimumMaximum {
	
	public static void main(String[] args) {
		
		int [] i = {1, 35, 23, 2};
		Arrays.stream(i).max().ifPresent(e ->
		System.out.println("minimum " + e));
		
	}

}
