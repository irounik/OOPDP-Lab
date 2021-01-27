package day2;

//Q4. Write a java program to check whether a number is palindrome or not.

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		sc.close();
		
		int rev = 0, temp = n;
		
		while(temp > 0) {
			rev= rev*10 + temp%10;
			temp = temp/10;
		}
		
		String ans = n == rev ? " is a Palindrome" : " is not a Palindrome";
		
		System.out.println(n + ans);
		
	}

}