package day6;

import java.util.Scanner;

public class Q1_Right_Angled_Triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides");
		
		int a = sc.nextInt();
		if(a<1) System.out.println();
		
		int b = sc.nextInt(), c = sc.nextInt();
		sc.close();
		
		if(!(a>0 && b>0 && c>0)) {
			System.err.println("Invalid Inputs");
			System.exit(0);
		} 
		
		if(a*a == (b*b) + (c*c) || b*b == (a*a)+ (c*c) || c*c == (a*a)+ (b*b)) {
			System.out.println("Right Angled Triangle");
		} 
		else {
			System.out.println("Not Right Angled Triangle");
		}
		
	}

}