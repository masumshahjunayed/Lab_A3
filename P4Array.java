package com.Sheet;

public class P4Array {

	public static void main(String[] args) {
		int count=0;
		int array[] = {7, 13, 2, 10, 6};
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]<10) {
				count ++;
				
			}
		}
		
		System.out.print(count);

	}

}
