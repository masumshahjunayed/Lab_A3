package com.Sheet;

import java.util.Scanner;

public class P5Arr {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int[] user = new int[6];
		int search, count=0;
		System.out.println("Enter the 6 number: ");
		
		for (int i = 0; i < user.length; i++) {
			user[i] = input.nextInt();
		}
		System.out.println("Please enter the searching number: ");
		
		search = input.nextInt();
		for (int i = 0; i < user.length; i++) {
			if (user[i] == search) {
				System.out.println(search + " was found ");
				count=1;
				break;
				
			}
		}
		if (count==0) {
			System.out.println(search + " was not found.");
		}
		
		System.out.println();

	}

}
