package day1;

import java.util.Scanner;

public class IsDigitSumPrime {

	/*
	   Write a program to add all the values in a 
	   given number and check if the sum is prime
	   number or not. Ex: 1234->10, not prime
	*/
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		int digitSum = 0;
		
		while(number > 0) {
			digitSum += number%10;
			number/=10;
		}
		
		if(digitSum < 2) {
			System.out.println("Digit Sum is Not Prime");
			return;
		}
		
		boolean isPrime = true;
		
		for(int i=2; i<=Math.sqrt(digitSum); i++) {
			if(digitSum % i == 0) {
				isPrime = false; 
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("Digit Sum is Prime");
		} else {
			System.out.println("Digit Sum is not Prime");
		}
		
	}

}
