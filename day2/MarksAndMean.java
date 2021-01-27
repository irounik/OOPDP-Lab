package day2;

/* Q2. Write a program to take input of 10 students marks in an array. 
 * 	   Find out the mean of the marks and print the marks which are 
 *     greater than the mean. */

import java.util.Scanner;

public class MarksAndMean {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int n = sc.nextInt();
		
		double total = 0;
		
		System.out.println("Enter the marks for " + n + " students: ");
		double marksArr[] = new double[n];
		
		for(int i=0; i<n; i++) {
			marksArr[i] = sc.nextDouble();
			total += marksArr[i];
		}
		
		double mean = total/n;
		
		System.out.println("Mean of marks is: " + mean);
		System.out.println("Marks which are grater than mean are: ");
		
		for(int i=0; i<n; i++) {
			if(marksArr[i]>mean) System.out.print(marksArr[i] + " ");
		}
		
		sc.close();
		
	}
	
}
