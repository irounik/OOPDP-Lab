package day7;

import java.util.Scanner;

/*
 Write an application that simulates coin tossing. 
 Let the program toss a coin each time the user chooses 
 the “Toss Coin” menu option. Count the number of times each
 side of the coin appears. 
 Display the results. 
 
 The program should call a separate method flip that takes no 
 arguments and returns false for tails and true for heads. 
 
 [Note: If the program realistically simulates coin tossing, 
  each side of the coin should appear approximately half the time.]
*/

public class Q4_CoinSimulation {

	static boolean flip() {
		return Math.random() > 0.5;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of tosses:");
		int total =  sc.nextInt();
		sc.close();
		
		int heads = 0, tails = 0;
		float percent = 0;
		int it = 1;
		
		System.out.println("I/T\tHEADS\tTAILS\tPercent");
		while(it<=total) {
			if(flip()) heads++;
			else tails++;
			percent = (float)heads/(float)(heads+tails)*100;
			System.out.printf("%d\t%d\t%d\t%.2f\n",it,heads,tails,percent);
			it++;
		}
	}

}