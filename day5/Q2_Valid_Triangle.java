package day5;

/* Q2.
Write an application that reads three nonzero values entered by the user and determines 
and prints whether they could represent the side of a triangle.
 */

import java.util.Scanner;

public class Q2_Valid_Triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides: ");

		double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
		sc.close();
		
		if(a<0 || b<0 || c<0) {
			System.out.println("Invalid Sides !");
		}
		else if(a+b>c && a+c>b && b+c>a) {
			System.out.println("Valid Triangle");
		}
		
	}

}
