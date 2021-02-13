package day4;

/* Q2
 * Write a program that inputs five numbers and determines 
 * and prints the number of negative numbers input, 
 * the number of positive numbers input and the number 
 * of zeros input.
 * 
 */

import java.util.Scanner;

public class Count_Input_Type {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int positive = 0, negative = 0, zeros = 0;
		
		System.out.println("Enter 5 numbers:");
		
		for(int i=1; i<=5; i++) {
			int temp = sc.nextInt();
			if(temp<0) negative++;
			else if(temp>0) positive++;
			else zeros++;
		}

		sc.close();
		
		System.out.println("Positives: \t"+ positive);
		System.out.println("Negatives: \t"+ negative);
		System.out.println("Zeros:     \t"+ zeros);
		
	}

}
