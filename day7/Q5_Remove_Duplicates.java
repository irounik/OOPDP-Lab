package day7;

/*

Write an application that inputs five numbers, 
each between 10 and 100, inclusive. 

As each member is read, display it only if it is not a duplicate of a 
number already read. 

Provide for the “worst case,” in which all five numbers are different. 
Use the smallest possible array to solve this problem. 

Display the complete set of unique values input after the user
enters each new value.

*/

import java.util.Scanner;

public class Q5_Remove_Duplicates {

	public static void main(String[] args) {
		
		final int n = 5;
		int set[] = new int[n], it=0, input;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the elements: ");
		
		for(int i=0; i<n; i++) {
			input = sc.nextInt();
			if(input<10 || input>100) {
				System.err.println("Enter a valid number in "
						+ "the given range.");
				i--;
				continue;
			}
			else { // For valid input
				boolean isDuplicate = false;
				for(int j=0; j<it; j++) {
					if(set[j]==input) {
						isDuplicate = true;
						break;
					}
				}
				if(!isDuplicate) { // if input is not duplicate
					set[it++] = input;
					// printing array
					System.out.print("{");
					for(int j=0; j<it-1; j++) {
						System.out.print(set[j]+", ");
					}
					System.out.println(set[it-1]+"}");
				}
				else {
					System.out.println("It's Duplicate");
				}
			}
			
		}
		sc.close();
	}
}