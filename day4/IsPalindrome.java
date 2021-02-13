package day4;

// Q5 Write a program to check whether a number given as input from the user is a Palindrome or not.

import java.util.Scanner;

public class IsPalindrome {
	
	static boolean isPal(String str) {
		
		int s = -1, e = str.length();
		
		while(++s<--e) {
			if(str.charAt(s)!=str.charAt(e)) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		int i=2;
		while(i-->0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			String str = sc.next();
			
			String ans = isPal(str) ? " is a Palindrome" : " is not a Palindrome";
			System.out.println(str+ans);
			System.out.println();
		}
		
	}

}
