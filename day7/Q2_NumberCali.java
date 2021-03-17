package day7;

/*

Write a program segments that accomplish each of the following tasks:

a. Calculate the integer part of the quotient when integer a is divided by integer b.

b. Calculate the integer remainder when integer a is divided by integer b.

c. Use the program pieces developed in parts (a) and (b) to write a method
   displayDigits that receives an integer between 1 and 99999 and displays it as a 
   sequence of digits, separating each pair of digits by two spaces. 
   
   For example the integer 4562 should appear as: 4 5 6 2

d. Incorporate the method developed in part (c) into an application that inputs 
   an integer and calls display Digits by passing the method the integer entered. 
   Display the results.

*/
import java.util.Scanner;

public class Q2_NumberCali {

	static class Calculation {
		int quotent(int a, int b) {
			return a/b;
		}
		int reminder(int a, int b) {
			return a%b;
		}
		void print(String num) {
			for(int i=0; i<num.length(); i++) {
				System.out.print(num.charAt(i)+"  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers 'a' and 'b': ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Calculation cal = new Calculation();
		
		System.out.println("Quotent of a/b = "+cal.quotent(a, b));
		System.out.println("Remainder of a/b = "+cal.reminder(a, b));
		System.out.println("\nEnter number to be printed in given format: ");
		
		String num = sc.next();
		System.out.println("Formatted Number:");
		cal.print(num);
		sc.close();
	}

}
