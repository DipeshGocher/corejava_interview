package co.rays.javaBasics;

public class PrimeNumber1 {

	public static void main(String[] args) {

		int number = 5;

		int count = 0;

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {

				count++;

			}

		}

		if (count == 0) {

			System.out.println("prime number");

		} else {

			System.out.println("not prime number");
		}
	}
}