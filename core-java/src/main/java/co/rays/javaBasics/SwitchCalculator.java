package co.rays.javaBasics;

import java.util.Scanner;

public class SwitchCalculator {
	
	    public static void main(String[] args) {
	    	
	    	int num1 = 6;
	    	int num2 = 5;
	    	int total = num1 - num2;
//	        Scanner scanner = new Scanner(System.in);
//
//	        System.out.print("Enter first number: ");
//	        double num1 = scanner.nextDouble();
//
//	        System.out.print("Enter second number: ");
//	        double num2 = scanner.nextDouble();
//
//	        System.out.println("Select operation: ");
//	        System.out.println("1: Addition (+)");
//	        System.out.println("2: Subtraction (-)");
//	        System.out.println("3: Multiplication (*)");
//	        System.out.println("4: Division (/)");
//
//	        int choice = scanner.nextInt();
//	        double result;

	        switch (total) {
	            case 1:
	               total =  num1 + num2;
	                System.out.println("Result: " + num1 + " + " + num2 + " = " + total);
	                break;
	            case 2:
	                total = num1 - num2;
	                System.out.println("Result: " + num1 + " - " + num2 + " = " + total);
	                break;
	            case 3:
	                total = num1 * num2;
	                System.out.println("Result: " + num1 + " * " + num2 + " = " + total);
	                break;
	            case 4:
	                if (num2 != 0) {
	                    total = num1 / num2;
	                    System.out.println("Result: " + num1 + " / " + num2 + " = " + total);
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;
	            default:
	                System.out.println("Invalid choice! Please select a valid operation.");
	                break;
	        }

	        
	    }
	}



