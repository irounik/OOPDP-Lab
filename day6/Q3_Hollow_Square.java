package day6;

import java.util.Scanner;

public class Q3_Hollow_Square {

	public static void main(String[] args) {
		
		// Taking User Input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of sides of square");
		int n = sc.nextInt();
		sc.close();
		
		// Printing Hollow Square
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || j==0 || i==n-1 || j==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}