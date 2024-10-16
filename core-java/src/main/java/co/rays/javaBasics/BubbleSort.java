package co.rays.javaBasics;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int [] num = { 30,10,20,40,55};
		int temp = 0;
		
		for(int i = 0; i<num.length; i++) {
			for(int j = i+1; j<2; j++) {
				if(num[i] > num[j]) {
					
					temp = num[i];
					num[i] = num [j];
					num[j] = temp;
				}
			}
			System.out.print(num[i]+ " ");
		}
	}

}
