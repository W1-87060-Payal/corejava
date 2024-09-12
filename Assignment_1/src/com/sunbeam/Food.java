/*
 Display food menu to user. User will select items from menu along with the
quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed
prices to food items(hard code the prices) When user enters 'Generate Bill'
option , display total bill & exit. */


package com.sunbeam;

import java.util.Scanner;

public class Food {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String[] menu = {"1.Dosa","2.Samosa","3.Idli","4.Paneer","5.Chole","6.Paratha","7.Puri","8.Chips","9.Wada","10.Generate Bill"};
			int[] price = {40,50,60,70,80,90,30,50,100,250};
			
			while(true) {
				System.out.println("Select an item from the menu : ");
				for(String item : menu) {
					System.out.println(item);
				}
				int a = sc 
						.nextInt();
				for(String i : menu) {
					System.out.println("");
				}
				if(a == 10) {
					System.out.println("Total Bill is: ");
				}
			}

	}
	}


