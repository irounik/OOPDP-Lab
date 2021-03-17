package day6;

import java.util.Scanner;

public class Q2_Validate_Palindrome {

	static boolean isPalindrome(String str) {
		
		int s=0, e = str.length()-1;
		
		while(s<=e) {
			if(str.charAt(e--) != str.charAt(s++)) {
				return false;
			} 
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String num;
		
		System.out.println("Enter a 5 digit number: ");
		
		while(true) {
			num = sc.next();
			
			if(num.length() != 5) {
				System.out.println("Please enter a valid 5 digit number!");
			} 
			else {
				break;
			}
		}

		sc.close();
		
		String ans = isPalindrome(num) ? " is a Palidrome":" is not a Plaindrome";
		System.out.println(num+ ans );
		
	}
	
}