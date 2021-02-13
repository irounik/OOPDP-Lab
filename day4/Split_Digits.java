package day4;

/*
 * Write an application that inputs one number consisting 
 * of five digits from the user separates the number 
 * into its individual digits and prints the digits 
 * separated from one another by three spaces each. 
 * 
 * For example if the user types in the number 42339, 
 * the program should print: 4	 2	 3	 3	 9
 */

import java.util.Scanner;

public class Split_Digits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 5 digit number: ");
		
		int num = sc.nextInt();
		sc.close();
		
		if(num>99999) System.out.println("It's bigger than 5 digits!");
		else if(num<10000) System.out.println("It's smaller than 5 digits!");
		
		String ans = "";
		
		while(num>0) {	
			ans= num%10 + "\t" + ans;
			num = num/10;
		}
		
		System.out.println("Splitted digits are: ");
		
		System.out.println(ans);

	}

}
