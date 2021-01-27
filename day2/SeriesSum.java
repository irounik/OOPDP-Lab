package day2;

/* Q3. Find the sum of the series : 
 *	   1+(1+2)+(1+2+3)+........+(1+2+3+.....+N)
 */

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of terms of series: ");
		
		int n = sc.nextInt();
		sc.close();
		
		int sum = 0, ind = 1;
		
		for(int i=n; i>0; i--,ind++) {
			sum+= i*ind;
		}
		
		System.out.println("Sum till "+ n +" term/s is: "+sum);
		
	}

}