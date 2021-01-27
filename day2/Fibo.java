package day2;

// Q1. Write a Java program to print the Fibonacci series upto 89. 

public class Fibo {
	
	public static void main(String[] args) {

		int a = 0, b = 1, c=0;
		int N = 89; // <-- Upto N
		
		System.out.println("Fibonacci upto series upto "+ N +" is: ");
		
		System.out.print(a+" ");
		
		while(c != N) {
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
 		
	}

}
