package com.Sheet;


import java.util.Scanner;

public class P8Array {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] user = new int[5];
		int flan=0;
		System.out.println("Enter the 5 number: ");
		for (int i = 0; i < user.length; i++) {
			user[i] = scan.nextInt();
		}
        int largetst = user[0];
        for(int i=0; i< user.length; i++)
        {
            if(user[i] > largetst){
            	largetst = user[i];
            	flan= i;
            }
        }
        System.out.println("Largest Number is : " + largetst + " & Location: " + flan);
	}
}