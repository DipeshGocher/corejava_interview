package co.rays.interview;

public class L {
	
	public static void main(String[] args) {
		
		int [] arr = {12, 87, 90, 100, 4, 6,3};
		
		int b = arr[0];
		
		for(int i = 1; i< arr.length; i++) {
			
			if(b > arr[i]) {
				b = arr[i];
			}
		}
		System.out.println(b);
	}

	

}
