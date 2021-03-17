package day5;

/* 
   Q1.
   Write an application that inputs an integer containing only 0s and 1s (i.e., a binary digit) 
   and prints its decimal equivalent. As an example decimal equivalent of binary 1101 is 13.
*/

import java.util.Scanner;

public class Q1_Bin_to_Dec {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Binary Number:");
		int bin = sc.nextInt();
		sc.close();
		
		int dec = 0, ind = 0;
		
		while(bin>0) {
			if(bin%10!=0 && bin%10!=1) {
				System.out.println("This is not a binary !");
				break;
			}
			dec += Math.pow(2,ind)*(bin%10);
			ind++;
			bin/=10;
		}
		
		if(bin==0) System.out.println(dec);

	}

}