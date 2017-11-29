package com.Sheet;

import java.util.Scanner;

public class P7Array {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] user = new int[5];
		int largest = user[0];
		System.out.println("Enter the 5 number: ");
		
		for (int i = 0; i < user.length; i++) {
			user[i] = scan.nextInt();
		}
		for (int i = 0; i < user.length; i++) {
			if (user[i] > largest) {
				largest = user[i];
			}
		}
		System.out.println("The largest number: " + largest);
	}

}
