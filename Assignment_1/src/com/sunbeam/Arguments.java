/*2. Accept 2 double values from User (using Scanner). Check data type. If
arguments are not doubles, supply suitable error message & terminate.
If numbers are double values, print its average. */


package com.sunbeam;

import java.util.Scanner;

public class Arguments {
	

          public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            System.out.print("Enter first double value: ");
	            double num1 = scanner.nextDouble();
	            
	            System.out.print("Enter second double value: ");
	            double num2 = scanner.nextDouble();
	            
	            double average = (num1 + num2) / 2;
	            System.out.println("Average: " + average);
	            
	        } catch (Exception e) {
	            System.out.println("Error: Please enter valid double values.");
	        } finally {
	            scanner.close();
	        }
	    }
	}
