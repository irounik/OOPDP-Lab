package day1;

import java.util.Scanner;

public class TypeOfChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character (C)");
		
		char c = sc.next().charAt(0);
		sc.close();
		
		if(c>='A' && c<='Z' || c>='a' && c<='z') {
			System.out.println(c+ " is an Alphabet");
		} else if(c>='0' && c<='9') {
			System.out.println(c+ " is a Digit");
		} else {
			System.out.println(c+" is a Special Character");
		}
		
	}

}
