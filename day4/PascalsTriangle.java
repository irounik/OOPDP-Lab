package day4;



// Q6. Write a program to print the PASCALS’s Triangle of n rows taking n as input from the use

/*
 *	        1   
 *	      1   1   
 *	    1   2   1   
 *	  1   3   3   1   
 *	1   4   6   4   1
 * 
// *///static int fact(int n) {
//		return n==0 ? 1 : n*fact(n-1);
//	}
//	
//	static int comp(int n, int r) {
//		return fact(n)/(fact(r)*fact(n-r));
//	}
import java.util.Scanner;	

public class PascalsTriangle {
	
	static int ncr(int n, int r) {
		return n==r||r==0 ? 1 : ncr(n-1,r-1) + ncr(n-1,r);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		sc.close();
		
		for(int i=0;i<n; i++) {
			for(int j=0; j<n-i-1; j++) System.out.print("  ");
			for(int j=0; j<=i; j++) System.out.print(ncr(i,j)+"   ");
			System.out.println();
		}
		
	}

}
